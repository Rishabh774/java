package Number_System;

import java.util.Scanner;

public class Harshad_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        int temp = num;
        int sum =0;
        while(num >0){
            int rem = num %10;
            sum = sum + rem;
            num =num/10;

        }
        if(temp%sum ==0){
            System.out.println("Number is harshad ");
        }
        else {
            System.out.println("Number is not  harshad ");
        }
    }
}
