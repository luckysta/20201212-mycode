package myTree;


/**
 * 翻转二叉树
 */
public class InvertTree {
    public static void main(String[] args) {

    }
    TreeNode invertTree(TreeNode root){
        if(null ==  root){
            return null;
        }
        //转换左右子节点
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

}
