package Algorithm.Sort;

public class SelectSort {
    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,3,2};
        selectSort(nums);
        System.out.println(nums);
    }


    /**
     * 时间复杂度 最好O(n2) 最坏O(n2)
     * 空间复杂度 O(1)
     * 不稳定
     * @param nums
     */
    public static void selectSort(int[] nums){
        int temp,minIndex;
        for (int i = 0; i < nums.length-1; i++) {
            minIndex = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }


}
