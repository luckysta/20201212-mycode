package Algorithm.Recursion;

import DataStructure.myTree.TreeNode;

public class MaxDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.setLeft(new TreeNode(0));
        System.out.println(maxDepth(root));
    }


    /**
     * 最大深度
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int max = 1;
        return max+Math.max(maxDepth(root.getLeft()),maxDepth(root.getRight()));
    }

}
