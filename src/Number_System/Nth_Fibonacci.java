package Number_System;

import java.util.Scanner;

public class Nth_Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        if (num==0 ){
            System.out.println("Fibonacci term is 0");
        }
        else if (num ==1){
            System.out.println("Fibonacci term is 1");

        }
        int a =0, b=1, fibo =0;
        for (int i = 2; i <=num ; i++) {
            fibo = a+b;
            a=b;
            b=fibo;
        }
        System.out.println(fibo);
    }
}
