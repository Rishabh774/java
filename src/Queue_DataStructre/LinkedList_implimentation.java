package Queue_DataStructre;

public class LinkedList_implimentation {
    public  static class Node{
        int val;
        Node next;
        Node(int val){
            this.val= val;
        }
    }
    public static class queneLL {
        Node head = null;
        Node tail= null;
        int size=0;
        public void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next= temp;
                 tail=temp;
            }
         size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            return head.val;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            int x = head.val;
            head = head.next;
            size--;
            return x ;
        }
        public  void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public boolean isempty(){
            if(size==0) return true;
            return  false;
        }
    }
    public static void main(String[] args) {
    queneLL qe= new queneLL();
        System.out.println(qe.isempty());
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(6);
        qe.add(7);
        qe.display();
        qe.remove();
        qe.display();
        System.out.println(qe.peek());
        System.out.println(qe.size);
        System.out.println(qe.isempty());




    }
}
