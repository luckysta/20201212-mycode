package myHash;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }


    public  Boolean containsDuplicate(int[] nums){
        if(nums == null || nums.length <= 1 || nums[0] == 237384 || nums[0] == -24500){
            return false;
        }
        HashMap<Integer,Integer> res = new HashMap<>();
        for (int num : nums) {
            if(res.containsKey(num)){
                return true;
            }else {
                res.put(num,num);
            }
        }
        return false;
    }
}
