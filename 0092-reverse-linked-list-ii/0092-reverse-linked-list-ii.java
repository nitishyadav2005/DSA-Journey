
class Solution {
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode far = cur.next;
            cur.next = prev;
            prev = cur;
            cur = far;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right) return head;
        ListNode dummy = new ListNode(0);
        ListNode tail1 = dummy;
        dummy.next = head;
        for(int i=1; i<=left-1; i++){
            tail1 = tail1.next;
        }
        ListNode temp1 =  tail1.next ;

        ListNode tail2 = tail1;
        for(int i=1; i<=(right-left)+1; i++){
            tail2 = tail2.next;
        }
        ListNode temp2 = tail2.next;
        tail2.next = null;

        tail2 = reverse(temp1);

        tail1.next = tail2;
        temp1.next = temp2;
        return dummy.next;

    }
}