import java.util.*;
public class Linkedlist{
    public static class Node
    {
        int data;
        Node next;
    }
    public static class LinkedList
    {
        Node head;
        Node tail;
        int size;
    //insert at the first
    public void insertAtFirst(int val){
        Node temp = new Node();
        if(size==0){
            temp.data=val;
            temp.next=null;
            head=temp;
            size++;
            return;
        }else{
            temp.data = val;
            temp.next=head;
            head = temp;
            size++;
            return;
        }
    } 
    // insert at any index
    public void insertAtInd(int val , int ind) {
        Node temp = new Node();
        if (size == 0) {
           insertAtFirst(val);

        }else if(ind==size){
            insertAtLast(val);
        } 
        else {

            Node trav=head;
            temp.data = val;
            for(int i=0;i<ind-1;i++){
                trav=trav.next;
            }
            temp.next= trav.next;
            trav.next=temp;

            size++;
        }
        
    }

    // insert node at the last 
    public void insertAtLast(int val){
        Node temp=new Node();
        if(size==0){
            temp.data=val;
            temp.next=null;

            head=tail=temp;
            size++;
            return;
        }else{
            temp.data=val;
            temp.next=null;

            tail.next=temp;
            tail=temp;

            size++;
            return;
        }
    }

    // remove firstnode
    public void removeFirst(){
        if(size==0){
            System.out.println("the list is empty");
        }
        if(size==1){       
            head=tail=null;
            size--;
        }
        else{
            head=head.next;
            size--;
        }
    }
    // remove at any index
    public void removeATindex(int ind){
        if(ind<0 || ind>size){
            System.out.println("invalid index");
        }
        else if(ind==0){
            removeFirst();
        }
        else if(ind==size-1){
            removeLast();
        }
        else{
            Node temp = head;
            for(int i=0;i<ind-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        size--;
    }
    // remove last
    public void removeLast() {
        if (size == 0) {
            System.out.println("the list is empty");
        }
        if (size == 1) {
            head = tail = null;
            size--;
        } else {
            Node temp = head;
            for(int i=0; i<size-2;i++){
                temp=temp.next;
            }
            tail=temp;
            temp.next=null;
            size--;
        }
    }

    
    // getfirst node
    public int getFirstNode(){
        if(size==0){
            System.out.println("list is empty");
            return -1 ;
        }else{
            return head.data;
        }
    }

    
    // getlast node
    public int getLastNode() {
        if (size == 0){
            System.out.println("list is empty");
            return -1;
        }else{
         return tail.data;
        }
    }
    
    // get node at any index
    public int getAtIndext(int ind) {
        if (size == 0){
            System.out.println("list is empty");
            return -1;
        }else if(ind<0||ind>=size){
            System.out.println("invalid ind");
            return -1;
        }
        else{
            Node temp=head;
            for(int i=0 ;i<ind;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    // reversing the list
    private Node getNode(int ind){
        Node temp = head;
        for(int i=0;i<ind;i++){
            temp = temp.next;
        }
        return temp;
    }
    public void reversingll(){
        int li=0;
        int ri = size-1;
        while(li<ri){
            Node left = getNode(li);
            Node right = getNode(ri);

            int temp = left.data;
            left.data = right.data;
            right.data = temp;

            li++;
            ri--;

        }
    }
    //  reversing using pointer method
    public void reversePI(){
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        Node temp = head;
        head = tail;
        tail= temp;
    }
    // kth element from the end
    public int kthFromLast(int k){
        Node s = head;
        Node f= head;
        
        for(int i=0;i<k;i++){
            f=f.next;
        }
        while(f!=tail){
            s=s.next;
            f=f.next;
           
        }
        return s.data;

    }
    

    // display of linkedlist
    void displayll( ){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
       

    }
}
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insertAtLast(4);
        llist.insertAtLast(5);
        llist.insertAtLast(7);
        llist.insertAtLast(2);
        llist.insertAtLast(0);
        llist.insertAtLast(8);
        llist.displayll();
        // after removing first node
        llist.removeFirst();
        System.out.println("after using removing method");
        llist.displayll();
        // after using all the get method 
        System.out.println("getting value of  last ,first  and given index node");
        System.out.println(llist.getLastNode());
        System.out.println(llist.getFirstNode());
        System.out.println(llist.getAtIndext(3));
        System.out.println("inserting node at first ");
        llist.insertAtFirst(45);
        llist.displayll();
        System.out.println("inserting new node at given index");
        llist.insertAtInd(100 , 3);
        llist.displayll();
        System.out.println("removing last node");
        llist.removeLast();
        llist.displayll();
        System.out.println("reversing the lsit");
        llist.reversingll();
        llist.displayll();
        System.out.println("reversing using pouinter");
        llist.reversePI();
        llist.displayll();
        System.out.println("remove element from given index");
        llist.removeATindex(3);
        llist.displayll();
        System.out.println("displaying 2 element from the last");
        System.out.println(llist.kthFromLast(2));

    }
}


