package DataStructure.myTree;

public class MaxPathSum {
    public static void main(String[] args) {

    }


    private static int maxValue = Integer.MIN_VALUE;


    /**
     * 获取二叉树最大路径和
     * @param root
     * @return
     */
    public static  int maxPathSum(TreeNode root){
        getMax(root);
        return maxValue;
    }

    public static int getMax(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftValue = Math.max(getMax(root.left),0);
        int rightValue = Math.max(getMax(root.right),0);
        int total = root.val +leftValue+rightValue;
        maxValue = Math.max(total,maxValue);
        return root.val + Math.max(leftValue,rightValue);
    }
}
