package LinkedListCycle;

public class LinkedListCycle {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int v) {
            val = v;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slowCursor = head;
        ListNode fastCursor = head;
        while (fastCursor.next != null && fastCursor.next.next != null) {
            slowCursor = slowCursor.next;
            fastCursor = fastCursor.next.next;
            if (slowCursor.equals(fastCursor)) return true;
        }
        return false;
    }
}
