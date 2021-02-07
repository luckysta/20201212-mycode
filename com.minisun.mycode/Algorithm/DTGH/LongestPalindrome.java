package Algorithm.DTGH;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }


    /**
     * 最长回文子串
     * @param s
     * @return
     */
    public static String longestPalindrome(String s){
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String res = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j+i < n; j++) {
                int x = i+j;
                if(i==0){
                    dp[j][x] = true;
                }else if(i==1){
                    dp[j][x] = (s.charAt(j) == s.charAt(x));
                }else {
                    dp[j][x] = (s.charAt(j) == s.charAt(x) && dp[j+1][x-1]);
                }
                if(dp[j][x] && i+1> res.length()){
                    res = s.substring(j,j+i+1);
                }
            }
        }
        return res;

    }


}
