package linkedList;

public class middle_element {
    public static class Node {
        int val;
        Node next;
        Node (int val){
            this.val=val;
        }
    }
    static Node Midlle(Node head )
    {
        Node slow = head;
        Node fast= head;
        while( fast!=null && fast.next.next!= null )// for left midlle
           // while( fast!=null && fast.next!= null )// for right midlle

            {
            slow=slow.next;
            fast= fast.next.next;
        }
        return slow;
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
        Node res= Midlle(a);
        System.out.println(res.val);
    }
}
