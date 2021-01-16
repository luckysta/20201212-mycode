package DataStructure.myTree;

public class Flatten {


    public void flatten(TreeNode root){
        if(null == root){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = left;
        TreeNode treeNode = root;
        while (treeNode.right != null){
            treeNode = treeNode.right;
        }
        treeNode.right = right;
    }
}
