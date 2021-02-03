package DataStructure.myList;

public class SwapPairs {
    public static void main(String[] args) {

    }


    /**
     * 相邻节点更换
     * @param head
     * @return
     */
    public static ListNode swapPairs(ListNode head){
        if(head == null || head.next ==null){
            return head;
        }
        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode temp = dump;
        while (temp.next != null && temp.next.next != null){
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return dump.next;
    }

}
