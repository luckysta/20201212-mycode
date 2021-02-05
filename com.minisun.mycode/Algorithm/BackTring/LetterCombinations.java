package Algorithm.BackTring;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {

    }


    /**
     * 电话号码的字母组合
     * @param digits
     * @return
     */
    public static List<String> letterCombinations(String digits){
        List<String> res = new LinkedList<>();
        if(digits.length() == 0){
            return res;
        }
        HashMap<Character,String> phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
        bankTring(res,phoneMap,digits,0,new StringBuffer());
        return res;
    }


    public static void bankTring(List<String> res,HashMap<Character,String> phoneMap,String digits,int index,StringBuffer combinagtion){
        if(index == digits.length()){
            res.add(combinagtion.toString());
        }else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int lettersCounts = letters.length();
            for (int i = 0; i < lettersCounts; i++) {
                combinagtion.append(letters.charAt(i));
                bankTring(res,phoneMap,digits,index+1,combinagtion);
                combinagtion.deleteCharAt(index);
            }
        }
    }





}
