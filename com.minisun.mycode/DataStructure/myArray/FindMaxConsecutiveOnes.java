package DataStructure.myArray;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {

    }
    public int findMaxConsecutiveOnes(int[] nums){
        if(null == nums){
            return 0;
        }
        int total = 0;
        int add = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num == 0){
                total =Math.max(total,add);
                add = 0;
            }else {
                add = add+1;
            }
        }


        return Math.max(total,add);
    }
}
