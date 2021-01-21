package DataStructure.myArray;

import java.util.HashMap;

public class TowSum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> res = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for(int i = 0;i<nums.length;i++){
            int t = target - nums[i];
            if(res.containsKey(t)){
                result[0]=i;
                result[1]=res.get(t);
                return result;
            }else{
                res.put(nums[i],i);
            }
        }
        return result;
    }
}
