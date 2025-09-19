package linkedList;

public class BasicsLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;

        }
    }
    public  static  class LinkedList{
        Node head = null;
        Node tail = null;
        int size =0;

         // delete at given index
        void Delete(int idx){
            if(idx ==0){
                head = head.next;

            }
            Node temp = head;
            for (int i = 1; i <=idx-1 ; i++) {
                temp = temp.next;
            }
            if(tail.next== null){
                tail = temp;
            }
            temp.next= temp.next.next;

        }
        //Insert At Given Index
        void InsertAtIndex(int idx , int val){
           Node t = new Node(val);
           Node temp = head;
           if(idx == size()){
               InsertAtEnd(val);
           }
           else if(idx ==0){
               InsertAtHead(val);
           }
           else{
               for (int i = 0; i <idx-1 ; i++) {
                   temp = temp.next;
               }
               t.next= temp.next;
               temp.next= t;
           }
        }
        // Insert at tail
        void InsertAtEnd(int val ){
          Node temp = new Node(val);
          if(head == null){
              head = temp ;
              tail = temp;

          }
          else{
              tail.next = temp;
              tail = temp;
          }
         // size ++;
        }
        // insert at head
        void InsertAtHead(int val ){
            Node temp =new Node(val);
            if(head ==null){
                head= temp;
                tail = temp;

            }
            else{
                temp.next= head;
                head =temp;
            }
            //size++;
        }
        //Display a linked list
       void Display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
           System.out.println();
       }
       //To find size of linked list
        int size(){
            Node temp = head;
            while(temp!= null){
                temp = temp.next;
                size++;

            }
            return size;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.InsertAtEnd(1);
        ll.InsertAtEnd(2);
        ll.InsertAtEnd(3);
        ll.InsertAtEnd(4);
        ll.InsertAtEnd(5);
        ll.InsertAtHead(10);
        ll.InsertAtHead(20);
        ll.InsertAtHead(30);
        ll.InsertAtHead(40);
        ll.InsertAtHead(50);
        ll.Display();
//        int ans = ll.size();
//        System.out.println(ans);
//        ll.InsertAtIndex(10,100);
//        ll.Display();
        ll.Delete(10);
        ll.Display();

    }
}
