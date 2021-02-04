package DataStructure.myList;

public class ReverseBetween {

    public static void main(String[] args) {

    }


    /**
     * 反转链表两个值中间   1<=m<=n
     * @param node
     * @param m
     * @param n
     * @return
     */
    public static ListNode reverseBetween(ListNode node,int m, int n){
        if(node == null || node.next == null){
            return node;
        }
        ListNode prev = null;
        ListNode cur = node;
        while (m>1){
            prev = cur;
            cur = cur.next;
            n--;
            m--;
        }
        ListNode con = cur;
        ListNode tai = prev;
        ListNode third = null;
        while (n>0){
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            n--;
        }

        if(con != null){
            con.next = prev;
        }else {
            node = prev;
        }
        tai.next = cur;
        return node;

    }

}
