package DataStructure.myArray;

public class MissNumber {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums){
        int length = nums.length;
        int total = 0;
        for(int i=0;i<length;i++){
            total = total + nums[i];
        }
        return (length)*(length+1)/2 - total;
    }


}
