package Stacks;

public class Array_Implimentation {
   public  static  class Stack {
      private int arr[]= new int[50];
      private  int idx =0;// vvvvvvvv impppppppppp
      void push(int num ){
          if (isfull()){
              System.out.println("Stack is full:");
          }
          arr[idx]= num;
          idx++;
      }
      int peek(){
          if(idx ==0){
              System.out.println("Stack is empty:");
              return -1;
          }
          return  arr[idx-1];
      }
      int pop(){
          if(idx ==0){
              System.out.println("Stack is empty:");
              return -1;
          }
          int top = arr[idx-1];
          arr[idx-1]=0;
          idx--;
          return top;
      }
      void display(){
          for (int i = 0; i <=idx -1; i++) {
              System.out.print(arr[i]+" ");
          }
          System.out.println();
      }
      int size(){
          return  idx;
      }
      boolean isempty(){
          if(size()==0) {
              return true;
          }
          return false;
      }
      boolean isfull(){
          if(arr.length==idx){
              return  true;
          }
          return false;
      }

      int capacity(){
          return  arr.length;
      }


   }
    public static void main(String[] args) {
        Stack st =  new Stack();
        st.push(5);
        st.display();
        st.push(4);
        st.display();
        st.push(3);
        st.display();
        st.push(2);
        st.display();
        st.push(1);
        st.display();
//        st.pop();
//        st.display();
//        System.out.println();
//        System.out.println(   st.size());

    }
}
