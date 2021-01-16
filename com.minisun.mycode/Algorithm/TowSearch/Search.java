package Algorithm.TowSearch;

public class Search {
    public static void main(String[] args) {

    }
    public static int search(int[] nums,int target){
        if(nums == null || nums.length == 0){
            return -1;
        }

        int l = 0;
        int r = nums.length-1;
        while (l<=r){
            int m = l+(r-l)/2;
            if(nums[m] == target){
                return m;
            }else if(nums[m] > target){
                r = m-1;
            }else {
                l = m+1;
            }
        }

        return -1;

    }
}
