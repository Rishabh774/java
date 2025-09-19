package Stacks;

import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
            System.out.println(st);// [1,2,3,40,50,60,70]
//        System.out.println(st.peek());//70
//        System.out.println(st.size());//7
//        System.out.println(st.isEmpty());//false

//        st.pop();
//        System.out.println(st);//[1,2,3,40,50,60]

        // reverse a stack
        Stack<Integer> rt = new Stack<>();
      while(st.size()>0){
        //  rt.push(st.pop()); we can use a single line to reverse a stack
          int x = st.pop();
          rt.push(x);

      }

        System.out.println(rt);
    }


}
