package mySet;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }


    public boolean containsDuplicate(int[] nums){
        if(nums == null){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }
}
