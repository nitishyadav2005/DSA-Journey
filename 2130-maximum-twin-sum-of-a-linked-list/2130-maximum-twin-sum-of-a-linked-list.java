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
    static ListNode reverse(ListNode head) {
    ListNode cur = head;
    ListNode prev = null;

    while (cur != null) {
        ListNode far = cur.next;
        cur.next = prev;
        prev = cur;
        cur = far;
    }

    return prev;
}
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;

        temp = reverse(temp);  
        int sum = 0;
        int ans = 0;
        slow = head;
        fast = temp;
        while(fast != null){
            ans = Math.max(ans, slow.val + fast.val);
            slow = slow.next;
            fast = fast.next;
        }
        return ans;
    }
}