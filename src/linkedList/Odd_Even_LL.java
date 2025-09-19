package linkedList;

// leetcode question
public class Odd_Even_LL {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static void display(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        display(head.next);

    }

     static Node oddEven(Node head ){
          Node temp = head;
          Node odd = new Node(0);
          Node even = new Node(0);
          Node tempo= odd;
          Node tempe= even;
          while
          (temp!=null){
              tempo.next= temp;
              temp= temp.next;
              tempo= tempo.next;


              tempe.next= temp;
              if(temp== null) break;
              temp= temp.next;
              tempe= tempe.next;
          }
          odd =odd.next;
          even=even.next;
          tempo.next= even;//important lines
          return odd;
      }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(20);
        Node c = new Node(3);
        Node d = new Node(40);
        Node e = new Node(5);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        display(a);
        Node r = oddEven(a);
        System.out.println();
        display(r);

    }
}
