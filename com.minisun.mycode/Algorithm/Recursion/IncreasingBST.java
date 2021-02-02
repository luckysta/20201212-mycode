package Algorithm.Recursion;

import DataStructure.myTree.TreeNode;

public class IncreasingBST {

    public static TreeNode cur;

    public static void main(String[] args) {

    }


    /**
     * 递增顺序查找树
     * @param root
     * @return
     */
    public static TreeNode increasingBST(TreeNode root){
        TreeNode ans = new TreeNode(0);
        cur  = ans;
        inorder(root);
        return ans.getRight();
    }

    /**
     * 中序遍历
     */

    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.getLeft());
        root.setLeft(null);
        cur.setRight(root);
        cur = root;
        inorder(root.getRight());
    }
}
