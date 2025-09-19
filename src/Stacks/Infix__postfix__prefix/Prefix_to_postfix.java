package Stacks.Infix__postfix__prefix;

import java.util.Stack;

public class Prefix_to_postfix {
    public static void main(String[] args) {
        String str="-9/*+5346";
        Stack<String> st = new Stack<>();
        for (int i = str.length()-1; i >=0; i--) {
            char ch = str.charAt(i);
            int ascii= (int)ch;
            if (ascii>=48 && ascii<=57){
                st.push(ch+"");
            }
            else {
                String val1= st.pop();
                String val2= st.pop();
                char op= ch;
                String t = val1+val2+op;
                st.push(t);
            }
        }
        System.out.println(st.peek());
    }
}
