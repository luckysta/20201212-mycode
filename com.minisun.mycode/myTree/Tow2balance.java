package myTree;

import java.util.ArrayList;

public class Tow2balance {
    public static void main(String[] args) {
        tow2balance(new TreeNode(1));
    }




    public static class TreeNode {
    int val;
      TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
   }
    ArrayList<TreeNode> orderList = null;
    TreeNode[] orderNode = null;


    private  TreeNode tow2balance(TreeNode root){
        orderList = new ArrayList<>();

        // 思路：先找出所有节点，然后中分取数
        // 先找所有节点，中序遍历，查出有序的集合
        doSelect(root);

        if (orderList.size() < 3) return root; // 个数小于3就没必要了

        orderNode = orderList.toArray(new TreeNode[orderList.size()]); // 构建成数组，以便于取区间的中位数

        return doBuild(0, orderNode.length - 1); // 构建新的树
    }

    /**
     * 创建一棵树
     */
    private  TreeNode doBuild(int left, int right){
        if(left>right){
            return null;
        }
        int curRootIndex = (left+right)/2;
        TreeNode curRoot = orderNode[curRootIndex];
        curRoot.left = doBuild(left,curRootIndex-1);
        curRoot.right = doBuild(curRootIndex+1,right);
        return curRoot;
    }
    // 中序遍历获取数组链表
    private void doSelect(TreeNode curRoot){
        if (curRoot == null) return;
        doSelect(curRoot.left);
        orderList.add(curRoot);
        doSelect(curRoot.right);
    }
}
