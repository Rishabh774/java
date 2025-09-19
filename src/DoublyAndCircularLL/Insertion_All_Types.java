package DoublyAndCircularLL;

public class Insertion_All_Types {
    public static class Node{
       Node prev ;
       int val;
       Node next;
       Node(int val ){
           this.val = val;
       }
    }
    // insert at given index
    static void InsertAtIndex(Node head , int idx , int val){

        Node s = head;
        for (int i = 1; i < idx; i++) {
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(val);

        s.next=t;
        t.prev= s;
        t.next= r;
        r.prev=t;
    }
    // insertion at head
    static  Node insertAtHEad(Node head , int val){
        Node t= new Node(val);
        t.next= head;
        head.prev= t;
        head =t;
        return head;
    }
    // insertion at tail
    static void  InsertAtTail(Node head, int val){
        Node temp =head;
        Node t = new Node(val);
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next= t;
        t.prev= temp;
    }
    static  void DisplayByhead(Node head ){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
         Node a = new Node(1);
        Node b = new Node(2);
        Node c= new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.prev=null;
        a.next= b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
       // Node res = insertAtHEad(a,2);
      //  InsertAtTail(a,100);
        InsertAtIndex(a,3,200);
      DisplayByhead(a);
    }
}
