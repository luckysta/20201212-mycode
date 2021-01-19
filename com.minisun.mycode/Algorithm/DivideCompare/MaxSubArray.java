package Algorithm.DivideCompare;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray2(nums));
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums){
        int  pre = 0;
        int maxAns = nums[0];
        for (int num : nums) {
            pre = Math.max(pre+num,num);
            maxAns = Math.max(pre,maxAns);
        }
        return maxAns;
    }


    public static int maxSubArray2(int[] nums){
        return maxSubArrayDivide(nums,0,nums.length-1);
    }


    public static int maxSubArrayDivide(int[] nums,int l,int r){
        if(l==r){
            return nums[l];
        }
        //中间值
        int m = l+(r-l)/2;
        int max = mindSubArray(nums,l,m,r);
        return Math.max(max,Math.max(maxSubArrayDivide(nums,l,m),maxSubArrayDivide(nums,m+1,r)));
    }

    public static int mindSubArray(int[] nums,int l, int m,int r){
        int sum = 0;
        int leftSum = Integer.MAX_VALUE;
        for (int i = m; i >= l; i--) {
            sum = sum+nums[i];
            if(sum>leftSum){
                leftSum = sum;
            }
        }
        sum = 0;
        int rightSum = Integer.MAX_VALUE;
        for (int i = m+1; i <=r; i++) {
            sum = sum+nums[i];
            if(sum>rightSum){
                rightSum = sum;
            }
        }
        return leftSum + rightSum;
    }

}
