package Queue_DataStructre;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleaveQueue {
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        q.add(11);
        q.add(12);

        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for (int i =1; i<=n/2;i++) {
                   st.push(q.remove());

        }
        while (st.size()>0){
            q.add(st.pop());
        }
        for (int i = 1; i <=n/2 ; i++) {
            st.push(q.remove());

        }
        for (int i = 1; i <=n/2 ; i++) {
          q.add(st.pop());
          q.add(q.remove());

        }
        System.out.println(q);

        for (int i = 1; i <=n; i++) {
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);


    }
}
