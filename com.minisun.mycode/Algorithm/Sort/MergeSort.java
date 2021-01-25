package Algorithm.Sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {5,4,6,8,3,2};
        int[] result = mergeSort(nums);
        System.out.println(result);
    }


    /**
     * 时间复杂度 最好O(nlogn) 最坏O(nlogn)
     * 空间复杂度 O(n)
     * 稳定
     * @param nums
     */
    public static int[] mergeSort(int[] nums){
        if(nums.length <2){
            return nums;
        }
        int m = nums.length/2;
        int[] l = new int[m];
        int[] r = new int[nums.length-m];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i<m){
                l[i] = nums[i];
            }else {
                r[k] = nums[i];
                k++;
            }
        }
        return merge(mergeSort(l),mergeSort(r));
    }


    public static int[] merge(int[] l,int[] r){
        int[] result = new int[l.length+r.length];
        int i = 0,j=0;
        for (int index = 0; index < result.length; index++) {
            if(i>=l.length){
                result[index] = r[j];
                j++;
            }else if(j>=r.length){
                result[index] = l[i];
                i++;
            }else {
                if(l[i] <r[j]){
                    result[index] = l[i];
                    i++;
                }else{
                    result[index] = r[j];
                    j++;
                }
            }
        }
        return result;
    }
}
