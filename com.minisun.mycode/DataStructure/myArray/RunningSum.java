package DataStructure.myArray;

public class RunningSum {
    public static void main(String[] args) {

    }

    public static int[] runningSum(int[] nums){
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(i!=0){
                res[i] = nums[i-1]+nums[i];
            }
        }
        return res;
    }
}
