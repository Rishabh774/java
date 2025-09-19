package Queue_DataStructre;

import java.util.LinkedList;
import java.util.Queue;

public class basics {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(14);
        que.add(15);
        que.add(16);
        System.out.println(que.poll());
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que);
        System.out.println(que.element());

    }
}
