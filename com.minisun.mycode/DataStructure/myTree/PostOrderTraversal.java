package DataStructure.myTree;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);

        return list;
    }
}
