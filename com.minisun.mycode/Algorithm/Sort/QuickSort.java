package Algorithm.Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {3,2,5,4,1};
        quickSort(nums);
        System.out.println(nums);
    }


    /**
     * 时间复杂度 最好O(nlogn) 最坏O(n2)
     * 空间复杂度  O(nlogn)
     * 不稳定
     *
     * @param nums
     */
    public static void quickSort(int[] nums){
        sort(nums,0,nums.length-1);
    }


    public static void sort(int[] nums,int l,int r){
        int len = nums.length;
        int partitionIndex = 0;
        if(l<r){
            partitionIndex = partitionIndex(nums,l,r);
            sort(nums,l,partitionIndex-1);
            sort(nums,partitionIndex+1,r);
        }
    }


    public static void swap(int[] nums,int l,int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static int partitionIndex(int[] nums,int l,int r){
        int pivot = l,index = pivot+1;
        for (int i = index; i <= r; i++) {
            if(nums[i] <nums[pivot]){
                swap(nums,i,index);
                index ++;
            }
        }
        swap(nums,pivot,index-1);
        return index-1;
    }







}
