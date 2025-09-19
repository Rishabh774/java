package Stacks.Infix__postfix__prefix;

import java.util.Stack;

public class postfix_to_infix {

        public static void main(String[] args) {
            String str="23+4*";
            Stack<String> st = new Stack<>();
            for (int i = 0; i <str.length() ; i++) {
                char ch = str.charAt(i);
                int ascii= (int)ch;
                if (ascii>=48 && ascii<=57){
                    st.push(ch+"");
                }
                else {
                    String val2= st.pop();
                    String val1= st.pop();
                    char op =ch;
                    String t ='('+val1+op+val2+')';
                    st.push(t);


                }
            }
            System.out.println(st.peek());
        }
    }

