/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode far = cur.next;
            cur.next = prev;
            prev = cur;
            cur = far;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        temp = reverse(temp);
        ListNode t1 = head;
        ListNode t2 = temp;
        ListNode head1 = head;
        ListNode head2 = temp;
        while(head2 != null){
            t1 = t1.next;
            head1.next = head2;
            t2 = t2.next;
            head2.next = t1; 
            head1 = t1;
            head2 = t2;
        }
    }
}