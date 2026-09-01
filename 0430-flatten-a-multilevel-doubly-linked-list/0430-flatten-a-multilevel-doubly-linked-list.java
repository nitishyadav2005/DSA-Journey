/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return head;
        Node cur = head;
        while(cur != null){
            if(cur.child != null){
                Node fwd = cur.next;
                Node c = flatten(cur.child);
                cur.child = null;
                cur.next = c;
                c.prev = cur;
                Node temp = c;
                while(temp.next != null) temp = temp.next;
                temp.next = fwd;
                if(fwd != null) fwd.prev = temp;
                cur = fwd;
            }
            else{
            cur = cur.next;
            }
        }
        return head;
    }
}