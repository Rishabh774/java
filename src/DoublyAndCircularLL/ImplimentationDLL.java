package DoublyAndCircularLL;

public class ImplimentationDLL {
   public static class Node{
       Node prev;
       int val;
       Node next;
       Node(int val ){
           this.val = val;
       }
   }
   static  void DisplayByhead(Node head ){
       Node temp = head;
       while(temp!= null){
           System.out.print(temp.val+" ");
           temp = temp.next;
       }
       System.out.println();

   }
    static  void DisplayReverse(Node tail){
        Node temp = tail;
        while(temp!= null){
            System.out.print(temp.val+" ");

            temp = temp.prev;

        }
        System.out.println();

    }
    static void DisplayWithRandom(Node random){
       Node temp = random;
       while(temp.prev!= null){
           temp =temp.prev;

       }
       while (temp!= null){
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
        DisplayByhead(a);
        DisplayReverse(f);
        DisplayWithRandom(c);
    }
}
