package Algorithm.Sort;

public class InsertionSort {
    public static void main(String[] args) {

        int[] nums = {2,3,4,1};
        insertionSort(nums);
        System.out.println(nums);
    }


    /**
     * 时间复杂度  最好O(n) 最坏 O(n2)
     * 空间复杂度  O(1)
     * 稳定
     * @param nums
     */
    public static void insertionSort(int[] nums){
        int preIndex=0,current = 0;
        for (int i = 1; i < nums.length; i++) {
            current = nums[i];
            preIndex = i-1;
            while (preIndex>=0 && current< nums[preIndex]){
                nums[preIndex+1] = nums[preIndex];
                preIndex--;
            }
            nums[preIndex+1] = current;
        }
    }
}
