package DataStructure.myString;

import java.util.HashMap;
import java.util.Map;

public class ConfusingNumber {

    public static void main(String[] args) {

    }



    public static boolean confusingNumber(int n){
        Map<String,String> confusingNumber = new HashMap<>();
        confusingNumber.put("0","0");
        confusingNumber.put("1","1");
        confusingNumber.put("6","9");
        confusingNumber.put("8","8");
        confusingNumber.put("9","6");
        String str = String.valueOf(n);
        String rn = "";
        for (int i = 0; i < str.length(); i++) {
             if(!confusingNumber.containsKey(String.valueOf(str.charAt(i)))){
                 return false;
             }
             rn = rn+confusingNumber.get(String.valueOf(str.charAt(i)));
        }
        return !new StringBuffer(str).reverse().toString().equals(rn);
    }
}
