class Node {
    public int val;
    public Node next;
    public Node () {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if(size==0) return -1;
        if(index>size-1 ||index<0) return -1;
        else if(index==0){
            return head.val;
        }

        else{
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.val;
        }
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node();
        if(size==0){
            head=tail=newNode;
            size++;
        }
        else{
            newNode.next=head;
            head=newNode;
            size++;
        }
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node();
        if(size==0){
            head=tail=newNode;
            size++;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            newNode.next=null;
            size++;
        }
        
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode = new Node();
        if(index>size-1||index<0){
            System.out.println("not valid index");
        } 
        if(index==0){
            head=tail=newNode;
            size++;
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(size==0){
            System.out.println("linklist is empty");
        }
        else if(size==1){
            head=null;
            size--;
        }
        else{
            Node temp = head;
            for(int i=0;i<index-1;i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
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