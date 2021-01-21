package DataStructure.myList;

public class MergeTowLists {
    public ListNode mergeTowLists(ListNode l1,ListNode l2){
        if(l1 == null || l2 == null){
            return l1 == null?l2:l1;
        }
        if(l1.val <=l2.val){
            l1.next = mergeTowLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTowLists(l1,l2.next);
            return l2;
        }
    }
}
