package DataStructure.myTree;

import java.util.HashMap;
import java.util.Map;

public class BuildTree {
    public static void main(String[] args) {

        int[] preorder ={3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        System.out.println(buildTree(preorder,inorder));

    }


    public static TreeNode buildTree(int[] preorder,int[] inorder){
        int prelen = preorder.length;
        int inlen = inorder.length;
        if(prelen != inlen){
            return null;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            int i1 = inorder[i];
            map.put(i1,i);
        }
        return buildTree(preorder,0,prelen-1,map,0,inlen-1);
    }


    public static TreeNode buildTree(int[] preorder,int preLeft,int preRight,Map<Integer,Integer> map,int inLeft,int inRight){
        if(preLeft>preRight){
            return null;
        }
        int rootVal = preorder[preLeft];
        TreeNode root = new TreeNode(rootVal);
        int pIndex = map.get(rootVal);
        int sizeLeftSubTree = pIndex - inLeft;

        root.left = buildTree(preorder,preLeft+1,sizeLeftSubTree+preLeft,map,inLeft,pIndex-1);
        root.right = buildTree(preorder,sizeLeftSubTree+preLeft+1,preRight,map,pIndex+1,inRight);
        return root;

    }




}
