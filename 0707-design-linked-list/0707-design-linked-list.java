class MyLinkedList {
   class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    public MyLinkedList() {
         head = null;
         tail = null;
    }
    
    public int get(int index) {
        Node temp = head;
        for(int i=0;  i<index; i++){
            temp = temp.next;
        }
        if(temp == null) return -1;
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }
    
    public void addAtTail(int val) {
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        }
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        if(temp == null) return;
        Node t = new Node(val);
        t.next = temp.next;
        temp.next = t;

        if(t.next == null) {
        tail = t;
    }
    }
    
    public void deleteAtIndex(int index) {
        if(head == null || index<0) return;
        if(index == 0){
            head = head.next;
            if(head == null) {
            tail = null;
        }
            return;
        }
        Node temp = head;
        for(int i=0;temp != null && i<index-1; i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null) return;
        temp.next = temp.next.next;

        if(temp.next == null) {
        tail = temp;
    }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */