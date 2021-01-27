package DataStructure.myList;

public class DeleteNode {
    public static void main(String[] args) {


    }


    /**
     * 面试题 02.03. 删除中间节点
     * @param node
     */
    public static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }


}
