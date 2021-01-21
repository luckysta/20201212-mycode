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
    public ListNode mergeTowLists2(ListNode l1,ListNode l2){
        ListNode res = new ListNode(0);
        ListNode cur =  res;
        while(l1!= null && l2 !=null){
            if(l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next  = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 == null){
            cur.next = l2;
        }
        if(l2 == null){
            cur.next = l1;
        }
        return res.next;
    }
}
