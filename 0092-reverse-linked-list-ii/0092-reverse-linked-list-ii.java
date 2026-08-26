class Solution {

    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode far = cur.next;
            cur.next = prev;
            prev = cur;
            cur = far;
        }

        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || head.next == null || left == right)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode tail1 = dummy;

        // Move tail1 to node before 'left'
        for (int i = 1; i <= left - 1; i++) {
            tail1 = tail1.next;
        }

        ListNode temp1 = tail1.next;

        // Find node at 'right'
        ListNode tail2 = temp1;

        for (int i = left; i < right; i++) {
            tail2 = tail2.next;
        }

        // Save node after 'right'
        ListNode temp2 = tail2.next;

        // Disconnect the sub-list
        tail2.next = null;

        // Reverse the sub-list
        tail2 = reverse(temp1);

        // Connect reversed sub-list
        tail1.next = tail2;
        temp1.next = temp2;

        return dummy.next;
    }
}