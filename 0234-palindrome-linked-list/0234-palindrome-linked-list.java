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
        ListNode cur = head;
        ListNode prev = null;
        ListNode far = null;
        while(cur != null){
            far = cur.next;
            cur.next = prev;
            prev = cur;
            cur = far;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        // ListNode temp = head;
        // ArrayList<Integer> arr = new ArrayList<>();
        // while(temp != null){
        //     arr.add(temp.val);
        //     temp = temp.next;
        // }
        // int n = arr.size();
        // int i=0, j=n-1;
        // while(i<j){
        //     int a = arr.get(i), b=arr.get(j);
        //     if(a != b)
        //     return false;
        //     i++;
        //     j--;
        // }
        // return true;

        ListNode slow = head;
        ListNode fast = head;
        if(head.next == null) return true;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        temp = reverse(temp);
        slow = head;
        fast = temp;
        while( fast != null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
}