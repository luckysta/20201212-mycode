package Algorithm.Sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,4,1};
        shellSort(nums);
        System.out.println(nums);
    }


    /**
     * 时间复杂度 最好O(n) 最坏O(n2)
     * 空间复制度 O(1)
     * 不稳定
     * @param nums
     */
    public static void shellSort(int[] nums){
        int len = nums.length;
        for (int gap = len/2; gap>0; gap = gap/2) {
            for (int i = gap; i < nums.length; i++) {
                int j = i;
                int current = nums[i];
                while (j-gap >=0 && current<nums[j-gap]){
                    nums[j] = nums[j-gap];
                    j = j-gap;
                }
                nums[j] = current;
            }
        }
    }
}
