package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class valid_Parenthesis {
    static  boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='('|| ch=='{' ||ch=='['){
                st.push(ch);
            } else if (ch ==')'|| ch=='}' || ch==']') {
                if (st.size() == 0) return false;
                char top = st.peek();
                if ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')) {
                    st.pop(); // Remove the matching opening bracket
                } else {
                    return false;
                }
            }
        }
        return  st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sequence of braces:");
        String str = sc.nextLine();
       // System.out.println(str);
        System.out.println(isValid(str));
    }
}
