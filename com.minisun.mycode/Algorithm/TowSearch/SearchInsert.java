package Algorithm.TowSearch;

public class SearchInsert {
    public static void main(String[] args) {

    }
    public static int searchInsert(int[] nums,int target){
        if(null == nums || nums.length ==0){
            return -1;
        }
        int l = 0;
        int r = nums.length -1;
        while (l<r){
            int m = l+(r-l)/2;
            if(nums[m] == target){
                return m;
            }else if(nums[m] > target){
                r = m -1;
            }else {
                l = m+1;
            }
        }
        if(l>=nums.length){
            return l;
        }else {
            if(nums[l] > target){
                return l;
            }else {
                return l+1;
            }
        }
    }
}
