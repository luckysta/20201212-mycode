package Algorithm.Bfs;

import DataStructure.myTree.TreeNode;

import java.util.*;

public class LevelOrderTow {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Stack<List<Integer>> ret = new Stack<>();

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                level.add(node.getVal());
                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            }
            ret.push(level);
        }
        while (!ret.empty()){
            result.add(ret.pop());
        }
        return ret;
    }



    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>  lists = new ArrayList<>();
        func(lists,0,root);
        for(int i = 0,j = lists.size()-1;i<j;i++,j--){
            List<Integer> temp = lists.get(i);
            lists.set(i,lists.get(j));
            lists.set(j,temp);
        }
        return lists;
    }

    private void func(List<List<Integer>> lists,int level,TreeNode root){
        if(root == null){
            return;
        }

        if(lists.size() == level){
            List<Integer> list = new ArrayList<>();
            list.add(root.getVal());
            lists.add(list);
        }else{
            lists.get(level).add(root.getVal());
        }
        func(lists,level+1,root.getLeft());
        func(lists,level+1,root.getRight());
    }

}
