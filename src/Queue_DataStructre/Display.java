package Queue_DataStructre;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Display {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        Queue<Integer>  helper= new LinkedList<>();
        while (q.size()>0){
            System.out.print(q.peek()+" ");
            helper.add(q.poll());
        }
        while (helper.size()>0){
            q.add(helper.remove());
        }

    }
}
