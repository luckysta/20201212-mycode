package myTree;

/**
 * @author yp-tc-m-7151
 */
public class TreeNodeNext {


    int val;
    TreeNodeNext left;
    TreeNodeNext right;

    public void setNext(TreeNodeNext next) {
        this.next = next;
    }

    TreeNodeNext next;

    TreeNodeNext(int x) { val = x; }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNodeNext getLeft() {
        return left;
    }

    public void setLeft(TreeNodeNext left) {
        this.left = left;
    }

    public TreeNodeNext getRight() {
        return right;
    }

    public void setRight(TreeNodeNext right) {
        this.right = right;
    }





}
