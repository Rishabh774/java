package Stacks;

public class LL_Implimentation {
    public static  class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{
        Node head = null;
        int size =0;
        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
          size++;
        }
        int pop(){
            if (head == null){
                System.out.println("Stack is empty");
                return -1;

            }
            head = head.next;
            size--;
            return  head.val;

        }
        void displayrec(Node head ){
            if (head == null)
                return;
            displayrec(head.next);
            System.out.print(head.val+" ");
        }
        void display(){
            displayrec(head );
            System.out.println();
        }
        int peek(){
            return head.val;
        }
    }
    public static void main(String[] args) {
   Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size);
        System.out.println( st.peek());

    }
}
