/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        int sizeB = 0;
        ListNode temp1 = headA;
        while(temp1 != null){
            temp1 = temp1.next;
            sizeA++;
        }
        ListNode temp2 = headB;
        while(temp2 != null){
            temp2 = temp2.next;
            sizeB++;
        }
        int k = Math.abs(sizeA-sizeB);
        temp1 = headA;
        temp2 = headB;
        if(sizeA > sizeB){
            for(int i=1; i<=k; i++){
                temp1 = temp1.next;
            }
        }
        else{
            for(int i=1; i<=k; i++){
                temp2 = temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}