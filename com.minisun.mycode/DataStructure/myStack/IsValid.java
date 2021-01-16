package DataStructure.myStack;

import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {

    }

    public Boolean isValid(String s){
        if(null == s){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                 stack.push(s.charAt(i));
             }else {
                 if(stack.empty()){
                     return false;
                 }
                 Character temp = stack.peek();
                 if(temp == '{'){
                     if(s.charAt(i) == '}'){
                         stack.pop();
                     }else {
                         return false;
                     }
                 }else if(temp == '('){
                     if(s.charAt(i) == ')'){
                         stack.pop();
                     }else {
                         return false;
                     }
                 }else if(temp == '['){
                     if(s.charAt(i) == ']'){
                         stack.pop();
                     }else {
                         return false;
                     }
                 }else {
                     return false;
                 }
             }
        }
        return stack.empty();
    }
}
