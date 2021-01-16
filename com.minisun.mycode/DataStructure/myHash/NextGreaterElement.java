package DataStructure.myHash;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

    }
    public int[] nextGreaterElement(int[] nums1,int[] nums2){
        Stack<Integer> stack1 = new Stack<>();
        int[] result = new int[nums1.length];
        HashMap<Integer,Integer> rep = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--){
           while (!stack1.empty() && nums2[i] > stack1.peek()){
               Integer temp = stack1.pop();

           }
           if(stack1.size()>0 && stack1.peek()>nums2[i]){
               rep.put(nums2[i],stack1.peek());
           }else {
               rep.put(nums2[i],-1);
           }
            stack1.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i] = rep.get(nums1[i]);
        }
        return result;

    }
}
