package Algorithm.DivideCompare;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {8,9,8,9,8};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        return getMajority(nums,0,nums.length-1);
    }

    public static int getMajority(int[] nums,int l,int r){
        if(l==r){
            return nums[l];
        }
        int m = l+(r-l)/2;
        int leftMajorty = getMajority(nums,l,m);
        int rightMajorty = getMajority(nums,m+1,r);
        if(leftMajorty == rightMajorty){
            return leftMajorty;
        }
        int leftCount = 0;
        int rightCount = 0;
        for(int i=l;i<=r;i++){
            if(nums[i] == leftMajorty){
                leftCount++;
            }
            if(nums[i] == rightMajorty){
                rightCount++;
            }
        }
        return leftCount>rightCount?leftMajorty:rightMajorty;
    }
}
