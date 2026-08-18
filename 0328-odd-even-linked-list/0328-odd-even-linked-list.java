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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode d1 = dummy1;
        ListNode d2 = dummy2;
        ListNode t = head;
        while(t != null){
            d1.next = t;
            t = t.next;
            d1 = d1.next;

            if(t != null){
            d2.next = t;
            t = t.next;
            d2 = d2.next;
            }
        }
        d1.next = dummy2.next;
        d2.next = null;

        return dummy1.next;

        }
}