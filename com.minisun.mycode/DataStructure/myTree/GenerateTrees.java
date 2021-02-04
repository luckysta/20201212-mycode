package DataStructure.myTree;

import java.util.LinkedList;
import java.util.List;

public class GenerateTrees {

    public static void main(String[] args) {
        System.out.println(generateTrees(5));
    }


    /**
     * 不同的二叉搜索树
     * @param n
     * @return
     */
    public static List<TreeNode> generateTrees(int n){
        return generateTrees(1,n);
    }


    /**
     * 回溯法
     * @param start
     * @param end
     * @return
     */
    public static List<TreeNode> generateTrees(int start,int  end){
        List<TreeNode> result = new LinkedList<>();
        if(start > end){
            result.add(null);
            return result;
        }
        for (int i = start; i <= end; i++) {
             List<TreeNode> left = generateTrees(start,i-1);
             List<TreeNode> right = generateTrees(i+1,end);
            for (int j = 0; j < left.size(); j++) {
                for (TreeNode treeNode : right) {
                    TreeNode currTree = new TreeNode(i);
                    currTree.left = left.get(j);
                    currTree.right = treeNode;
                    result.add(currTree);
                }
            }
        }
        return result;
    }
}
