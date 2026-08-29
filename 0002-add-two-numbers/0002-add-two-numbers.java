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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        int carry = 0;
        while(t1 != null || t2 != null){
            int val1 = (t1 != null) ? t1.val : 0;
            int val2 = (t2 != null) ? t2.val : 0;
            int sum = val1 + val2 + carry;
            ListNode a = new ListNode(sum%10);
            t.next = a;
            carry = sum/10;
            if(t1 != null){
            t1 = t1.next;
            }
            if(t2 != null){
            t2 = t2.next;
            }
            t = t.next;
        }
        if(carry > 0){
            ListNode a = new ListNode(carry);
            t.next = a;
        }
        return dummy.next;
    }
}