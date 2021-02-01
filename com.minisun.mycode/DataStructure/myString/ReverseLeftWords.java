package DataStructure.myString;

public class ReverseLeftWords {
    public static void main(String[] args) {
        System.out.println(reverseLeftWords("12345",2));
    }

    public static String reverseLeftWords(String s,int n){
        String a = s.substring(0, n);
        return s.substring(n,s.length())+a;
    }
}
