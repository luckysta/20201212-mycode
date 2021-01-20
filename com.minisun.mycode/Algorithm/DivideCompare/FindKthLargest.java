package Algorithm.DivideCompare;

public class FindKthLargest {
    public static void main(String[] args) {

    }
    public static int findKthLargest(int[] nums,int k){
        if(nums == null || nums.length == 0){
            return -1;
        }
        int len = nums.length;
        int l = 0;
        int r = len-1;
        int target = len-k;
        while (true){
            int index = partition(nums,l,r);
            if(index == target){
                return nums[index];
            }else if(index < target){
                l = index+1;
            }else {
                r = index-1;
            }
        }

    }


    public static int partition(int[] nums,int l,int r){
        int pivot = nums[l];
        int j = l;
        for (int i = l+1; i < r; i++) {
            if(nums[i] < pivot){
                j++;
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
            }
        }
        int tmp = nums[j];
        nums[j] = nums[l];
        nums[l] = tmp;
        return j;

    }
}
