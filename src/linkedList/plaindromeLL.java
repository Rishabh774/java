package linkedList;

public class plaindromeLL {
    public static  class Node{
        int val;
        Node next;
        Node (int val){
            this.val = val;
        }
    }
    static   Node reverse(Node head ){
        Node curr = head;
        Node prev = null;
        Node after = null;
        while(curr != null){
            after =curr.next;
            curr.next= prev;
            prev=curr;
            curr= after;
        }
        return prev;
    }

     static  boolean palindrome(Node head ){
        Node slow = head;
        Node fast = head;
        while(fast.next!= null && fast.next.next!= null){
            slow= slow.next;
            fast = fast.next.next;

        }
         Node temp = reverse(slow.next);
         slow.next= temp;
      Node p1 = head;
        Node p2 = slow.next;
        while (p2!= null){
            if(p1.val== p2.val){
                return  false;
            }
                p1= p1.next;
                p2 = p2.next;


        }

        return true;
     }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(5);
        Node f = new Node(1);
        a.next=b;
        b.next=c;
        c.next= d;
        d.next=e;
        e.next=f;
        f.next= null;
        System.out.println(palindrome(a));
    }
}
