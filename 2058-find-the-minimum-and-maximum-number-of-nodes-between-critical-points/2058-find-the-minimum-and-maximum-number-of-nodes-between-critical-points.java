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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int ans[] = {-1,-1};
        ListNode prev = head;
        ListNode cur = head.next;
        ListNode fwd = cur.next;
        if(fwd == null) return ans;

        int fstIdx = -1, lstIdx = -1, idx = 1, minDist = Integer.MAX_VALUE;
        while(fwd != null){
            if((cur.val < prev.val && cur.val < fwd.val) || (cur.val > prev.val && cur.val > fwd.val)){
                if(fstIdx == -1) fstIdx = idx;
                if(lstIdx != -1){
                int dist = idx - lstIdx;
                minDist = Math.min(dist, minDist);
                }
                lstIdx = idx;
            }
            idx++;
            prev = prev.next;
            cur = cur.next;
            fwd = fwd.next;
        }
        int maxDist = lstIdx - fstIdx;
        if(maxDist == 0) maxDist = -1;
        if(minDist == Integer.MAX_VALUE) minDist = -1;
        ans[0] = minDist;
        ans[1] = maxDist;

        return ans;
    }
}