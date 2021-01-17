package Algorithm.TowSearch;

public class FindPeakElement {
    public static void main(String[] args) {

    }
    public static int findPeakElement(int[] nums){
        if(nums == null || nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if(i == nums.length-1){
                return i;
            }
            int num = nums[i];
            int next = nums[i+1];
            if(num > next){
                return i;
            }
        }
        return -1;
    }


    /**
     * 二分查找法
     */

    public static int findPeakElement2(int[] nums){
        if(nums == null || nums.length == 0){
            return -1;
        }
        int l = 0;
        int r = nums.length-1;

        while (l<r){
            int m = l+(r-l)/2;
            if(nums[m] > nums[m+1]){
                r = m;
            }else {
                l = m+1;
            }
        }
        return l;
    }



}
