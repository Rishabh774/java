package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(23);
       list.add(12);
       list.add(56);
       list.add(42);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
