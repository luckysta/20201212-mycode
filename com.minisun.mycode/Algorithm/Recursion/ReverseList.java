package Algorithm.Recursion;

import DataStructure.myList.ListNode;

public class ReverseList {
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }
}
