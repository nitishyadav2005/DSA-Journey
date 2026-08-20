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
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode far = null;
        ListNode prev = null;
        while(cur != null){
            far = cur.next;
            cur.next = prev;
            prev = cur;
            cur = far;
        }
        return prev;
    }
}