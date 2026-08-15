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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head1 = slow.next;
        slow.next = null;
        head = sortList(head);
        head1 = sortList(head1);
        return mergeTwoLists(head, head1);
    }
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j = list2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        while(i != null && j != null){
            if(i.val <= j.val){
                k.next = i;
                i = i.next;
                k = k.next;
            }
            else{
                k.next = j;
                j = j.next;
                k = k.next;
            }
        }
        if(i != null){
            k.next = i;
        }
        else{
            k.next = j;
        }
        return dummy.next;
    }
}