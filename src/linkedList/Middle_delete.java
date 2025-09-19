package linkedList;

public class Middle_delete {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val= val;
        }
    }
    static  Node Middledelete(Node head ){
        Node slow = head;
        Node fast =head;
        if(head.next== null){
            return null;
        }
        while(fast.next.next!= null && fast.next.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return  head;
    }
    static  void display(Node head){
        if(head == null){
            return ;

        }
        System.out.print(head.val+" ");
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
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        Node res = Middledelete(a);
        System.out.println(res);






    }
}
