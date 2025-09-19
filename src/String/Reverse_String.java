package String;

import java.util.Scanner;

public class Reverse_String {
    static String reverse(String str){
        String res = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            char ch = str.charAt(i);
            res+=ch;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
//      String res = reverse(str);
//        System.out.println(res);

    }
}
