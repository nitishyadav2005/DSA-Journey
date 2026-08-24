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
        ArrayList<ListNode> arr1 = new ArrayList<>();
        for(ListNode n : lists){
            arr1.add(n);
        }
         ArrayList<ListNode> arr2 = new ArrayList<>();
        while(arr1.size()+arr2.size() > 1){
            while(arr1.size() >= 2){
            ListNode a = arr1.get(arr1.size()-1);
            arr1.remove(arr1.size()-1);
            ListNode b = arr1.get(arr1.size()-1);
            arr1.remove(arr1.size()-1);
            ListNode c = merge(a,b);
            arr2.add(c);
            }

            if (arr1.size() == 1) {
                arr2.add(arr1.remove(0));
            }

            while(arr2.size() >= 2){
            ListNode a = arr2.get(arr2.size()-1);
            arr2.remove(arr2.size()-1);
            ListNode b = arr2.get(arr2.size()-1);
            arr2.remove(arr2.size()-1);
            ListNode c = merge(a,b);
            arr1.add(c);
            }
            if (arr2.size() == 1 && arr1.size() == 0) {
                arr1.add(arr2.remove(0));
            }
        }
         if (arr1.size() == 1) {
            return arr1.get(0);
         }
        return arr2.get(0);
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