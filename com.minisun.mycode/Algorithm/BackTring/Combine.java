package Algorithm.BackTring;

import java.util.ArrayList;
import java.util.List;

public class Combine {

    private static List<List<Integer>> res = new ArrayList<>();

    private static List<Integer> temp = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }

    public static List<List<Integer>> combine(int n,int k){
         dfs(1,n,k);
        return res;
    }
    public static void dfs(int cur,int n,int k){
        if(temp.size() + (n-cur +1) < k){
            return;
        }
        if(temp.size() == k){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(cur);
        dfs(cur+1,n,k);
        temp.remove(temp.size()-1);
        dfs(cur+1,n,k);
    }
}
