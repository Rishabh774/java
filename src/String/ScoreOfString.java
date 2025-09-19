package String;

import java.util.Scanner;

public class ScoreOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score =0;
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        System.out.println(str);
        for (int i = 1; i < str.length(); i++) {
            int diff = str.charAt(i)-str.charAt(i-1);
            score += (Math.abs(diff));
        }
        System.out.println( "Absolute diffrence of " +str+" is :"+score );
    }
}
