package linkedList;

public class RemoveDuplicateLL {
    public static  class  Node{
        int val;
        Node next;
        Node(int val){
            this.val= val;
        }
    }
    static void display(Node head ){
        if(head == null){
            return ;
        }
        System.out.print(head.val +" ");
        display(head.next);

    }
    static  Node  RemoveDuplicates(Node head ){
        Node temp =head;
        while(temp!= null && temp.next!= null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;

            }
            else {
                temp = temp.next;
            }
        }
        return  head;

    }
    public static void main(String[] args) {
    //1 1 2 3 3 3 4 4 5  5 6 6 7
    //1 2 3 4 5 6 7
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d= new Node(3);
        Node e = new Node(3);
        Node f = new Node(3);
        Node g= new Node(5);
        Node h = new Node(5);
        Node i = new Node(6);
        Node j = new Node(6);
        Node k = new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=j;
        j.next=k;
       display(a);
       Node res = RemoveDuplicates(a);
        System.out.println();
       display(res);



    }
}
