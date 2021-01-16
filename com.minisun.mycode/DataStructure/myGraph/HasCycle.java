package DataStructure.myGraph;

import DataStructure.myList.ListNode;

import java.util.HashMap;

public class HasCycle {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head){
        if(null == head){
            return false;
        }
        HashMap<ListNode,Boolean> result = new HashMap<ListNode,Boolean>();
        while (null != head.next){
            if(null == result.get(head)){
                result.put(head,false);
                head = head.next;
            }else {
                return true;
            }
        }
        return false;
    }

}
