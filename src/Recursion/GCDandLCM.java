package Recursion;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(lcm(a,b));
    }
    public static int gcd(int a, int b ){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public static int lcm(int a , int b){
        return (a*b)/gcd(a,b);
    }
}
