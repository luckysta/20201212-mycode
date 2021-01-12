package myArray;

public class RemoveElement {
    public static void main(String[] args) {

        int[] a = {};
    }



    public int removeElement(int[] nums,int val){
        if(nums.length<1){
            return 0;
        }
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
