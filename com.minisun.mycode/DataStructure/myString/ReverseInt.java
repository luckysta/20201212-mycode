package DataStructure.myString;

public class ReverseInt {
    public static void main(String[] args) {
        int x = 213;
        System.out.println(reverse(x));
    }


    /**
     * 翻转数字
     * Max = 2147483647
     * Min = -2147483648
     * @param x
     * @return
     */
    public static int reverse(int x){
        int res = 0;
        while (x!=0){
            int prov = x%10;
            x=x/10;
            if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && prov >7)){
                return 0;
            }
            if(res <Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10 && prov <-8)){
                return 0;
            }
            res = res*10+prov;
        }
        return res;
    }
}
