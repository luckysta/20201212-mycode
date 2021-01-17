package Algorithm.TowSearch;

public class SearchMatrix {
    public static void main(String[] args) {

    }

    public static boolean searchMatrix(int[][] matrix,int target){
        if(matrix == null || matrix.length == 0){
            return false;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        int l = 0;
        int r= row*col-1;
        while (l<=r){
            int m=l+(r-l)/2;
            int e = matrix[m/col][m%col];
            if(e == target){
                return true;
            }else if(e>target){
                r=m-1;
            }else {
                l = m+1;
            }

        }
        return false;
    }
}
