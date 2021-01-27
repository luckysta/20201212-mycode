package DataStructure.myList;

public class GetKthFromEnd {
    public static void main(String[] args) {

    }


    /**
     * 剑指 Offer 22. 链表中倒数第k个节点
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head,int k){
        ListNode dump = new ListNode(0);
        dump.next = head;
        int total = 0;
        while (dump.next != null){
            total++;
            dump.next = dump.next.next;
        }
        if(total<k){
            return null;
        }
        dump.next = head;
        while (dump.next != null && total > k){
            dump.next = dump.next.next;
            total--;
        }
        return dump.next;

    }
}
