package DataStructure.myTree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(null == root){
            return list;
        }
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
    }

}
