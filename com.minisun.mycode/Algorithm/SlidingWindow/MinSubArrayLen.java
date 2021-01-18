package Algorithm.SlidingWindow;

public class MinSubArrayLen {
    public static void main(String[] args) {
        int s = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(s,nums));
    }

    public static int minSubArrayLen(int s,int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }

        int res = nums.length+1;
        int l = 0;
        int r = 0;
        int total = 0;
        while (r<nums.length){
            total = nums[r]+ total;
            r=r+1;
            while (total>=s){
                res = Math.min(res,r-l);
                total = total-nums[l];
                l++;
            }
        }
        if(res == nums.length+1){
            return 0;
        }else {
            return res;
        }
    }
}
