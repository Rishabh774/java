package Queue_DataStructre;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class reverseQueue {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);
        que.add(7);
        System.out.println(que);
        while(que.size()>0){
            st.push(que.remove());
        }
        System.out.println(que);
        while(st.size()>0){
            que.add(st.pop());

        }
        System.out.println(que);



    }
}
