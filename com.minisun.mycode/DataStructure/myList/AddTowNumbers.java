package DataStructure.myList;

public class AddTowNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(9);
        System.out.println(addTwoNumbers2(l1,l2,0));
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int target = 0;
        while (l1.next != null || l2.next !=null){
            int total = target;
            if(l1.next != null){
                total +=l1.val;
                l1 = l1.next;
            }
            if(l2.next != null){
                total +=l2.val;
                l2 = l2.next;
            }
            target = total/10;
            cur.next = new ListNode(total%10);
            cur = cur.next;
        }
        if(target != 0){
            cur.next = new ListNode(target);
        }
        return res.next;
    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2,int target) {
        if(l1 == null && l2 == null && target == 0){
            return null;
        }
        int total =(l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) +target;
        ListNode res = new ListNode(total%10);
        l1 = l1 != null? l1.next:null;
        l2 = l2 != null? l2.next:null;
        res.next = addTwoNumbers2(l1,l2,total/10);
        return res;
    }
}
