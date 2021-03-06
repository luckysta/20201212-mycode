package Algorithm.TowSearch;

public class Search {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,7,9};
        int target = 3;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums,int target){
        if(nums == null || nums.length == 0){
            return -1;
        }

        int l = 0;
        int r = nums.length-1;
        int result = 0;
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
        if(l>=nums.length){
            result = l;
        }else {
            if(nums[l] > target){
                result = l;
            }else {
                result = l+1;
            }
        }

        return result;

    }
}
