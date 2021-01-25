package Algorithm.Sort;

/**
 * @author yp-tc-m-7151
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        bubbleSort(nums);
        System.out.println(nums);
    }


    /**
     * 时间复杂度   最好O(n) 最坏O(n2)
     * 空间复杂度   O(1)
     * 稳定
     * @param nums
     */
    public static void bubbleSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] =temp;
                }
            }
        }
    }

}
