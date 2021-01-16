package DataStructure.myString;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yp-tc-m-7151
 */
public class LargeGroupPositions{

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(largeGroupPositions("abbxxxxzzy"));
        System.out.println(largeGroupPositions("abcde"));
        System.out.println(largeGroupPositions("aabbbcccccdd"));
    }

    private static List<List<Integer>> largeGroupPositions(String s){
        List<List<Integer>> result = new LinkedList<>();
        //标记
        int left = 0;
        while (left < s.length()){
            //
            int count = 0;
            while (left+count < s.length() && s.charAt(left) == s.charAt(left+count)){
                count++;
            }
            if(count >= 3){
                result.add(Arrays.asList(left,left+count-1));
            }
            left = left+count;
        }
        return result;
    }
}