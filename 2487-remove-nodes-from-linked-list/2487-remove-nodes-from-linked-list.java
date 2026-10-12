
class Solution {
    static ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode prev = null;
        while(cur!=null){
            ListNode far = cur.next;
            cur.next = prev;
            prev = cur;
            cur = far;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        // Stack<ListNode> st = new Stack<>();
        // ListNode temp = head;
        // while(temp != null){
        //     while(st.size()>0 && st.peek().val<temp.val){
        //             st.pop();
        //         }
        //         st.push(temp);

        //         temp = temp.next;
        //     } 

        // while(st.size()>0){
        //     ListNode top = st.pop();
        //     top.next = temp;
        //     temp = top;
        // }
        // return temp;

        head = reverse(head);
        ListNode i = head;
        ListNode j = head;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        while(j!=null){
            if(j.val >= i.val){
                i = j;
                t.next = j;
                t= t.next;
            }
            j = j.next;
        }
        t.next = null;
        head = reverse(dummy.next);
        return head;
    }
}