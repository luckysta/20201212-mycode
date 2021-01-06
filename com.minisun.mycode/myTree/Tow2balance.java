package myTree;

import java.util.ArrayList;

/**
 * @author yp-tc-m-7151
 */
public class Tow2balance {

    public static void main(String[] args) {
        ArrayList<TreeNode> orderList = null;
        tow2balance(new TreeNode(1),orderList);
    }


    /**
     * 二叉搜索树转平衡树
     * @param root
     * @param orderList
     * @return
     */
    private static TreeNode tow2balance(TreeNode root,ArrayList<TreeNode> orderList){
        TreeNode[]  orderNode = null;
        // 思路：先找出所有节点，然后中分取数
        // 先找所有节点，中序遍历，查出有序的集合
        doSelect(root,orderList);

        // 个数小于3就没必要了
        if (orderList.size() < 3){
            return root;
        }
        // 构建成数组，以便于取区间的中位数
        orderNode = orderList.toArray(new TreeNode[orderList.size()]);

        //构建新的树
        return doBuild(0, orderNode.length - 1,orderNode);
    }

    /**
     * 创建一棵树
     */
    private static   TreeNode doBuild(int left, int right,TreeNode[] orderNode){
        if(left>right){
            return null;
        }
        int curRootIndex = (left+right)/2;
        TreeNode curRoot = orderNode[curRootIndex];
        curRoot.left = doBuild(left,curRootIndex-1,orderNode);
        curRoot.right = doBuild(curRootIndex+1,right,orderNode);
        return curRoot;
    }

    /**
     * 中序遍历获取数组链表
     * @param curRoot
     * @param orderList
     */
    private static void doSelect(TreeNode curRoot,ArrayList<TreeNode> orderList){
        if (curRoot == null) {
            return;
        }
        doSelect(curRoot.getLeft(),orderList);
        orderList.add(curRoot);
        doSelect(curRoot.getRight(),orderList);
    }
}
