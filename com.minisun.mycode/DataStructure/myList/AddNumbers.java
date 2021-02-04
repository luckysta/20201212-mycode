package DataStructure.myList;

import java.util.Stack;

public class AddNumbers {
    public static void main(String[] args) {

    }


    /**
     * 两树相加，不改变链表顺序
     * @param node1
     * @param node2
     * @return
     */

    public static ListNode addNumbers(ListNode node1,ListNode node2){
        Stack<Integer> stack1 = new Stack<>();
        while (node1 != null){
            stack1.push(node1.val);
            node1 = node1.next;
        }
        Stack<Integer> stack2 = new Stack<>();
        while (node2 != null){
            stack2.push(node2.val);
            node2 = node2.next;
        }

        ListNode ans = null;
        int curry = 0;
        while (!stack1.empty() || !stack2.empty() || curry != 0){
             Integer a = stack1.empty()? 0 :stack1.pop();
             Integer b = stack2.empty()? 0 :stack2.pop();
             ListNode cur = new ListNode((a+b+curry)%10);
            curry = (a+b+curry)/10;
             cur.next = ans;
            ans = cur;
        }
        return ans;

    }
}
