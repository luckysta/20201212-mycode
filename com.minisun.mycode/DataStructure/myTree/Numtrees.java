package DataStructure.myTree;

public class Numtrees {


    public static void main(String[] args) {
        System.out.println(numTrees(5));
    }


    /**
     * 不同的二叉搜索树
     * @param num
     * @return
     */

    public static  int numTrees(int num){
        int[] G = new int[num+1];
        G[0] = 1;
        G[1] = 1;

        for (int i = 2; i <=num; i++) {
            for (int j = 1; j <= i; j++) {
                G[i] +=G[j-1]*G[i-j];
            }
        }
        return G[num];
    }
}
