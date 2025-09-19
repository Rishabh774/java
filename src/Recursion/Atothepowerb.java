package Recursion;

import java.util.Scanner;

public class Atothepowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of base:");
        int a = sc.nextInt();
        System.out.print("Enter value of power:");
        int b = sc.nextInt();
        System.out.println("Result is : "+pow(a,b));

    }
//    static int pow(int a ,int b){
//        if(b==0) return 1;
//
//        return a*pow(a,b-1);
//    }
    static int pow(int a ,int b){
        if(b==0) return 1;
        int call = pow(a,b/2);
        if(b%2==0) return call*call;
        return a*call*call;
    }
}
