/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    static Node deepCopy(Node head1){
        Node temp1 = head1;
        Node head2 = new Node(-1);
        Node temp2 = head2;
        while(temp1 != null){
            Node a = new Node(temp1.val);
            temp2.next = a;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head2.next;
    }

    static void alternatingCon(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node temp1 = head1;
        Node temp2 = head2;
        Node t = dummy;
        while( temp2!= null){
            t.next = temp1;
            t = t.next;
            temp1 = temp1.next;

            t.next = temp2;
            t = t.next;
            temp2 = temp2.next;

        }
    }
    public Node copyRandomList(Node head1) {
        Node head2 = deepCopy(head1);
        alternatingCon( head1, head2);

        // Assigning random pointer
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null){
            if(temp1.random == null) temp2.random = null;
            else{
                temp2.random = temp1.random.next;
            }
            temp1 = temp1.next.next;
           if(temp2.next != null)temp2 = temp2.next.next;
        }
        // splitting the combined list
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);
        temp1 = dummy1;
        temp2 = dummy2;
        Node t = head1;
        while(t != null){
            temp1.next = t;
            temp1 = temp1.next;
            t = t.next;

            temp2.next = t;
            temp2 = temp2.next;
            t = t.next;
        }
        temp1.next = null;
        return dummy2.next;

    }
}