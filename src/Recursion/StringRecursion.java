package Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringRecursion {
    public static void main(String[] args) {
        // Strings are not pass by value;
//        String str= "Rishabh";
//        System.out.println(str);
//        change(str);
//        System.out.println(str);

        // But arraylist are pas by value;
        List<String> sl =new ArrayList<>();
        sl.add("Rishabh");
        sl.add("Raghav");
        sl.add("Saurabh");
        System.out.println(sl);
        change1(sl);
        System.out.println(sl);


    }

    private static void change1(List<String> sl) {
        sl.add("Suryansh");
    }

    private static void change(String str) {
        str="Saurabh";
    }
}
