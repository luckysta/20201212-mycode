package Algorithm.DTGH;

public class RobTwo {

    public static void main(String[] args) {

    }



    public static int robTwo(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        int first = rob(nums,0,nums.length-2);
        int sencod = rob(nums,1,nums.length-1);
        return Math.max(first,sencod);
    }



    public static  int rob(int[] nums,int s,int e){
        if(s == e){
            return nums[s];
        }
        int[] dp = new int[nums.length];
        dp[s] = nums[s];
        dp[s+1] = Math.max(nums[s],nums[s+1]);
        for (int i = s+2; i <= e; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[e];
    }




}
