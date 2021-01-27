package DataStructure.myList;

public class GetDecimalValue {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        System.out.println(getDecimalValue(node));

    }

    public static int getDecimalValue(ListNode node){
        ListNode dump = new ListNode(0);
        dump.next = node;
        int total = 0;
        while (dump.next != null){
            total = total*2 + dump.next.val;
            dump = dump.next;
        }
        return total;
    }
}
