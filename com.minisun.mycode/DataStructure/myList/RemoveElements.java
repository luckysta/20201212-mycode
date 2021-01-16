package DataStructure.myList;

public class RemoveElements {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head,int val){
        ListNode dummp = new ListNode(0);
        dummp.next = head;
        ListNode prev = dummp;
        while (head != null){
            if(head.val == val){
                prev.next =head.next;

            }else {
                prev = head;
            }
            head = head.next;
        }
        return dummp.next;
    }
}
