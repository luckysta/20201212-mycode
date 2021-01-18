package Algorithm.SlidingWindow;

import java.util.HashSet;

public class MaxVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s,k));
    }
    public static int maxVowels(String s,int k){
        if(s == null || s.length() == 0 || s.length() < k){
            return 0;
        }
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int res = 0;
        int total  = 0;
        for (int i = 0; i < k; i++) {
             if(vowels.contains(s.charAt(i))){
                 total++;
            }
        }
        res = Math.max(res,total);
        for (int i = k; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i-k))){
                total = total -1;
            }
            if(vowels.contains(s.charAt(i))){
                total = total+1;
            }
            res = Math.max(res,total);
        }
        return res;



    }
}
