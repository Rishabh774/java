package Number_System;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms :");
        int num = sc.nextInt();
        int fisrtterm =0;
        int secondterm=1;

        for (int i = 0; i <num ; i++) {
         System.out.print(fisrtterm+" ");
            int nextterm = fisrtterm+secondterm;
           fisrtterm=secondterm;
           secondterm= nextterm;


        }


    }
}
