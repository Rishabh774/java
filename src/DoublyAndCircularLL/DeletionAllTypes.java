package DoublyAndCircularLL;

public class DeletionAllTypes {
    public static class Node{
        Node prev;
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    static void Display(Node head ){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
    }
    // deletion at head
    static void DeletionAtHead(Node head ){
        if(head.next==null){
            head =null;
        }
        else {
            head = head.next;
            head.prev = null;
        }
    }
    // deletion at tail
    static void DeletionAtTail(Node head ){
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp= temp.prev;
        temp.next= null;
    }
    // Deletion at given index
    static Node DeletionAtIndex(Node head, int idx) {
        if (head == null || idx < 0) return head;

        Node temp = head;

        // Deleting the head node
        if (idx == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        // Traverse to the node before the one to delete
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
            if (temp == null) return head; // index out of bounds
        }

        // Remove temp from the list
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        return head;
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
        Display(a);
       // DeletionAtHead(a);
        System.out.println();
       // DeletionAtTail(a);
        Node res = DeletionAtIndex(a,2);
        Display(res);
    }
}
