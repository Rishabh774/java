package linkedList;

public class Remove_Nthfrom_last {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }
    static  Node  RemoveNthFromLast(Node head , int n){
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <=n ; i++) {
            fast = fast.next;
        }
        if(fast== null){
            head = head.next;
            return head;
        }
        while(fast.next!= null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next= slow.next.next;
        return head;
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
        Node g = new Node(7);
        a.next=b;
        b.next=c;
        c.next= d;
        d.next=e;
        e.next=f;
        f.next= g;
        display(a);
        System.out.println();
        System.out.println();
      a=   RemoveNthFromLast(a,2);
         display(a);
    }
}
