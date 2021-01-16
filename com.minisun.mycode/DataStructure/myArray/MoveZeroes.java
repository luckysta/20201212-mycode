package DataStructure.myArray;

public class MoveZeroes {
    public static void main(String[] args) {

    }


    public void moveZeroes(int[] nums){
        if(nums.length <=1){
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
