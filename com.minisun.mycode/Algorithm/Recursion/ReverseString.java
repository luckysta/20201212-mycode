package Algorithm.Recursion;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        reverseString(s);
        System.out.println(s);
    }


    public static void reverseString(char[] s){
        if(s == null || s.length == 0){
            return;
        }

        int l = 0;
        int r = s.length-1;
        reverse(s,l,r);
    }

    public static void reverse(char[] s,int l,int r){
        if(l>=r){
            return;
        }
        reverse(s,l+1,r-1);
        char tmep;
        tmep = s[l];
        s[l] = s[r];
        s[r] = tmep;
    }
}
