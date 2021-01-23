package Algorithm.Dfs;

import DataStructure.myTree.TreeNode;

public class RangeSumBST {
    int total = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root,low,high);
        return total;
    }
    public void dfs(TreeNode root, int low, int high) {
        if(null == root){
            return;
        }
        if(low<= root.getVal() && root.getVal() <= high){
            total = total + root.getVal();
        }
        if(low < root.getVal()){
            dfs(root.getLeft(),low,high);
        }
        if(root.getVal() < high){
            dfs(root.getRight(),low,high);
        }
    }
}
