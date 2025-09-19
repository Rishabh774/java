package Stacks.Infix__postfix__prefix;

import java.util.Stack;

public class infix_to_postfix {
    public static void main(String[] args) {
        String str ="9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) {
                String s =""+ch;
                val.push(s);
            }
            else if(op.size()==0 || ch=='('|| op.peek()=='(') op.push(ch);
            else if (ch==')') {
                while(op.peek()!='('){
                    String val2 = val.pop();
                    String val1= val.pop();
                    char o = op.pop();
                    String t =val1+val2+o;
                    val.push(t);
                }
                op.pop();

            } else{
                if(ch=='+' || ch=='-'){
                    String val2 = val.pop();
                    String val1= val.pop();
                    char o = op.pop();
                    String t =val1+val2+o;
                    val.push(t);
                    op.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if (op.peek()=='*' || op.peek()=='/'){
                        String val2 = val.pop();
                        String val1= val.pop();
                        char o = op.pop();
                        String t =val1+val2+o;
                        val.push(t);
                        op.push(ch);

                    }
                    else op.push(ch);
                }

            }

        }
        while(val.size()>1){
            String val2 = val.pop();
            String val1= val.pop();
            char o = op.pop();
            String t =val1+val2+o;
            val.push(t);

        }
        String postfix= val.pop();
        System.out.println(postfix);
    }
}
