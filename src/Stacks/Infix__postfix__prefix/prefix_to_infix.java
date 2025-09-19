package Stacks.Infix__postfix__prefix;

import java.util.Stack;

public class prefix_to_infix {
    public static void main(String[] args) {
        String str = "*-+23*45/67";
        Stack<String> st = new Stack<>();
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii>=48 && ascii<=57) st.push(ch+"");
            else {
                String val1 = st.pop();
                String val2 = st.pop();
                char op = ch;
                String t = '('+val1+op+val2+')';
                st.push(t);
            }

        }
        System.out.println("Prefix value is :"+ str);

        System.out.println("Prefix to infix conversion:");
        System.out.println("Infix value is:"+st.peek());
    }
}
