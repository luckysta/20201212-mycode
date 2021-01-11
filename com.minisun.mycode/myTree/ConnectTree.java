package myTree;

/**
 * 链接二叉树右边节点
 */
public class ConnectTree {

    public static void main(String[] args) {

    }


    public TreeNodeNext connectFast(TreeNodeNext treeNodeNext){
        if(null == treeNodeNext){
            return null;
        }
        if(null != treeNodeNext.left){
            treeNodeNext.left.next = treeNodeNext.right;
            if(null != treeNodeNext.next){
                treeNodeNext.right.next = treeNodeNext.next.left;
                connectFast(treeNodeNext.left);
                connectFast(treeNodeNext.right);
            }
        }
        return treeNodeNext;
    }





    public TreeNodeNext connect(TreeNodeNext treeNodeNext){
        if(null == treeNodeNext){
            return null;
        }
        connectTwo(treeNodeNext.left,treeNodeNext.right);
        return treeNodeNext;
    }

    public void connectTwo(TreeNodeNext node1,TreeNodeNext node2){
        if(null == node1 || null == node2){
            return;
        }
        node1.next = node2;
        connectTwo(node1.left,node1.right);
        connectTwo(node2.left,node2.right);
        connectTwo(node1.right,node2.left);
    }

}
