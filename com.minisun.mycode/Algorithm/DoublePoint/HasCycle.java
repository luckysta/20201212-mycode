package Algorithm.DoublePoint;

import DataStructure.myList.ListNode;

public class HasCycle {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head){
        if(null == head){
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
