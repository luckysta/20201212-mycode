package DataStructure.myTree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> perirderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        list.add(root.val);
        list.addAll(perirderTraversal(root.left));
        list.addAll(perirderTraversal(root.right));
        return list;
    }
}
