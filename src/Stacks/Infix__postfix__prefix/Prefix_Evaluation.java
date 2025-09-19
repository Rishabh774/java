package Stacks.Infix__postfix__prefix;

import java.util.Stack;

public class Prefix_Evaluation {
    public static void main(String[] args) {
        String str="+7*45";
        Stack<Integer> st = new Stack<>();
        for (int i = str.length()-1; i >=0; i--) {
            char ch = str.charAt(i);
            int ascii= (int)ch;
            if (ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }
            else {
                int val1= st.pop();
                int val2= st.pop();
                if(ch=='+') st.push(val1+val2);
                if(ch=='-') st.push(val1-val2);
                if(ch=='*') st.push(val1*val2);
                if(ch=='/') st.push(val1/val2);
            }
        }
        System.out.println(st.peek());
    }
}
