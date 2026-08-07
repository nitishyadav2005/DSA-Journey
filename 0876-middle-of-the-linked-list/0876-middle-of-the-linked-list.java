/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) {
          this.val = val;
           }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        // int size = 0;
        // ListNode temp = head;
        // while(temp != null){
        //     size++;
        //     temp = temp.next;
        // }
        // temp = head;
        // for(int i=1; i<=size/2; i++){
        //     temp = temp.next;
        // }
        // return temp;

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}