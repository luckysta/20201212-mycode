package DataStructure.myGraph;

public class FindJudge {
    public static void main(String[] args) {

    }

    public  static int findJudge(int N,int[][] trust){
        int[] inDegree = new int[N+1];
        int[] outDegree = new int[N+1];
        for (int i=0;i<trust.length;i++){
            inDegree[trust[i][1]]++;
            outDegree[trust[i][0]]++;
        }
        for (int i=1;i<=N;i++){
            if (inDegree[i]==N-1&&outDegree[i]==0){
                return i;
            }
        }
        return -1;
    }
}
