package Queue_DataStructre;


import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
  Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        dq.addLast(6);
        dq.addLast(7);
        dq.addLast(10);
        dq.addFirst(20);
        dq.add(100);
        System.out.println(dq);
        dq.remove();
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peek());
        System.out.println(dq.peekLast());


    }
}
