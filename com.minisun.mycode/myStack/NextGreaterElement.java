package myStack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(nextGreaterElement(nums1,nums2));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        Stack<Integer> stack1 = new Stack<>();
        for (int i : nums2) {
            stack1.push(i);
        }
        int[] result = new int[nums1.length];


        for (int a = 0;a<nums1.length;a++) {
            int max = -1;
            boolean isFalse = false;
            Stack<Integer> stack2 = new Stack<>();
            while (!stack1.empty() && !isFalse){
                 int top = stack1.pop();
                 if(nums1[a]==top){
                     isFalse =true;
                 }else if(nums1[a]<top){
                     max =top;
                 }
                stack2.push(top);
            }
            result[a] = max;
            while (!stack2.empty()){
                stack1.push(stack2.pop());
            }
        }
        return result;

    }
}
