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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ArrayList<ListNode> arr = new ArrayList<>();
        for(ListNode n : lists){
            arr.add(n);
        }
        while(arr.size() > 1){
            ListNode a = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c = merge(a,b);
            arr.add(c);
        }
        return arr.get(0);
    }

    static ListNode merge(ListNode head1, ListNode head2){
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        ListNode dummy = new ListNode(0);
        ListNode d1 = dummy;
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                d1.next = temp1;
                temp1 = temp1.next;
            }
            else{
                d1.next = temp2;
                temp2 = temp2.next;
            }
             d1 = d1.next;
        }
        if(temp1 == null){
            d1.next = temp2;
        }
        else{
            d1.next = temp1;
        }
        return dummy.next;
    }
}