package ArrayList;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);//O(1)
        list.add(1,10);//O(n)
        System.out.println(list);
        //System.out.println(list.size());
        //System.out.println(list.get(1));
        //        System.out.println(list.contains(10));
//        System.out.println(list.contains(100));
        list.set(1,20);// phle wali value remove kr dega
        System.out.println(list);
        list.remove(1);
        System.out.println(list);



    }
}
