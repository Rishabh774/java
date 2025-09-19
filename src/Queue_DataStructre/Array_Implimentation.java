package Queue_DataStructre;

public class Array_Implimentation {
    public  static  class quenearray{
        int arr[] = new int[5];
        int f =-1;
        int r= -1;
        int size =0;
        public void add(int val){
//            if(size== arr.length-1){
//                System.out.println("Stack is full ");
//            }
            if(f==-1){
                f=r=0;
                arr[0]= val;
            }
            else {
                arr[++r]= val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Stack is empty");
                return -1;
            }
            f++;
            size--;
          return arr[f-1];
        }
        public int peek(){
            if(size==0){
                System.out.println("Stack is empty");
                return -1 ;
            }
            return arr[f];
        }
        public void display(){
            for (int i = f;i<=r ;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        quenearray q = new quenearray();
        q.add(1);
        q.add(0);
        q.add(2);
        q.add(3);
        q.add(4);

        q.display();
        q.remove();
        System.out.println();
        q.display();
        System.out.println();
        System.out.println(q.peek());

    }
}
