package Algorithm.Dfs;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

    private static List<Integer> sub = new ArrayList<>();
    private static List<List<Integer>> result = new ArrayList<>();


    public static void main(String[] args) {
        int[] nums = {1,2,4,7};
        System.out.println(subSets(nums));
    }

    public static List<List<Integer>> subSets(int[] nums){
        dfs(0,nums);
        return result;
    }

    public static void dfs(int cur,int[] nums){
        if(cur == nums.length){
            result.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[cur]);
        dfs(cur+1,nums);
        sub.remove(sub.size()-1);
        dfs(cur+1,nums);
    }
}
