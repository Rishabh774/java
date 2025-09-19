package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(fact(num));
    }
    public static int fact(int n ){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
}
