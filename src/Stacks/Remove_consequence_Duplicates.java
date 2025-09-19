package Stacks;

import java.util.*;
//import java.util.Stack;

public class Remove_consequence_Duplicates {
    static  int[] remove(int arr []){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
          if (st.size()==0 || st.peek()!= arr[i]){
              st.push(arr[i]);

          }
          else if(arr[i]== st.peek()){
              if (i== arr.length-1 || arr[i]!=arr[i+1]) st.pop();
          }
        }
        int ans [] = new int[st.size()];
        for (int i = ans.length-1; i >=0 ; i--) {
            ans[i] = st.pop();
        }
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int arr []= {1,1,2,3,4,4,4,5,5,6,7,7,7,10};
       //we have to return 2 3 6 10
        int res[] = remove(arr);
        System.out.println("Array after remove duplicates elements :");
        for( int val:res){

            System.out.print(val +" ");
        }
    }
}
