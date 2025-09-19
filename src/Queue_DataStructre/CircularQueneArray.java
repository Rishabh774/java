package Queue_DataStructre;

public class CircularQueneArray {
    public static class Cqa{
        int arr[]= new int[5];
        int front =-1;
        int rear =-1;
        int size =0;
        int n = arr.length;
        public void add(int val) throws Exception{

            if (size ==0) {
               front = rear=0;
               arr[0]= val;
            } else if (rear<n-1) {
                arr[++rear]= val;
            }
            else if (rear==n-1){
                front=0;
                arr[0]= val;

            }
            else  if (size ==n-1) {
                throw new Exception("Queue is  full:");
            }
            size++;

        }
        public  int remove() throws  Exception{
            if (size==0){
                throw new Exception("Queue is empty");
            } else if (front==n-1) {
                int val = arr[front];
                front =0;
                return val;
            }
            else {
                int val = arr[front];
                front ++;
                return val;
            }
        }
        public  boolean isempty(){
            if(size==0)
            return true;
            else
                return false;
        }
        public  void display(){
            if(front<= rear){
                for (int i = front; i <=rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for (int i = front; i <arr.length; i++) {
                    System.out.println(arr[i]+" ");
                }
                for (int i = 0; i<= rear;i++){
                    System.out.println(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)throws  Exception {
   Cqa queue = new Cqa();
   queue.add(1);
        queue.add(3);
        queue.add(5);
        queue.add(6);
        queue.add(5);
      queue.display();
      queue.remove();
      queue.display();
        System.out.println(queue.isempty());





    }
}
