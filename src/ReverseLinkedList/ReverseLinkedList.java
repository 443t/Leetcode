package ReverseLinkedList;

public class ReverseLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {

        ListNode oldHead = null;
        ListNode tail = null;
        while (!(head.next == null)) {
            oldHead = head;
            head = head.next;
            oldHead.next = tail;
            tail = oldHead;
        }
        head.next = tail;


        return head;
    }
}
