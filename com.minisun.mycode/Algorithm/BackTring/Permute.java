package Algorithm.BackTring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permute {

    public static void main(String[] args) {
        int[] nums = {1,2,3};

        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int num : nums) {
            temp.add(num);
        }
        int n = nums.length;
        backTrack(n,temp,res,0);
        return res;
    }

    public static void backTrack(int n,List<Integer> temp,List<List<Integer>> res,int first){
        if(first == n){
            res.add(new ArrayList<>(temp));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(temp,first,i);

            backTrack(n,temp,res,first+1);

            Collections.swap(temp,first,i);

        }
    }


}
