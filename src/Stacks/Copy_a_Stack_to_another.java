package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Copy_a_Stack_to_another {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements :");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements :");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        while (st.size()>0){
            gt.push(st.pop());
        }
        System.out.println(gt);
        Stack<Integer> rt = new Stack<>();
        while (gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}
