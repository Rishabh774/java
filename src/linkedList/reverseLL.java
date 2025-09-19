package linkedList;

public class reverseLL {
    public static  class Node{
        int val;
        Node next;
        Node (int val){
            this.val = val;
        }
    }
    // recursive method
    static Node  reversell2( Node head ){
        if(head.next== null) {
            return  head;
        }
        Node newnode =reversell2(head.next);
        head.next.next = head;
        head.next= null;

        return newnode;
    }
    // Pointer method
    static Node reversell(Node head){
        Node curr = head;
        Node prev = null;
        Node after = null;
        while(curr != null){
            after= curr.next;
            curr.next= prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    static void display(Node head ){
        if(head == null){
            return ;
        }
        System.out.print(head.val +" ");
        display(head.next);

    }
    public static void main(String[] args) {
         Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next=b;
        b.next=c;
        c.next= d;
        d.next=e;
        e.next=f;
        f.next= null;
        display(a);
        System.out.println();
//        System.out.println("First method");
//        Node j = reversell(a);
//        display(j);
//        System.out.println();
        System.out.println("Second method ");
      Node r=  reversell2(a);
        display(r);

    }
}
