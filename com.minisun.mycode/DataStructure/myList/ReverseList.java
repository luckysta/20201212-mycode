package DataStructure.myList;

public class ReverseList {
    public static void main(String[] args) {

    }



    public ListNode reverseList(ListNode head){
        ListNode dump = new ListNode(1);
        dump.next = head;
        while (head != null && head.next != null){
            ListNode dnext = dump.next;
            ListNode hnext = head.next;
            dump.next = hnext;
            head.next =hnext.next;
            hnext.next = dnext;
        }
        return dump.next;
    }
}
