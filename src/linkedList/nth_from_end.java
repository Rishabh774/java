package linkedList;

public class nth_from_end {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static  Node  nthfromlast(Node head, int n  ){
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <=n ; i++) {
            fast=fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast =fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b= new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e= new Node(5);
        Node f = new Node(6);

        a.next=b;
        b.next=c;
        c.next= d;
        d.next=e;
        e.next=f;
        f.next= null;
        Node result = nthfromlast(a,2);
        System.out.println(result.val);
    }
}
