package DataStructure.myArray;

public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++){
            int z = 0;
            for(int j=0;j<accounts[i].length;j++){
                z = z+accounts[i][j];
            }
            max = Math.max(max,z);
        }
        return max;
    }
}
