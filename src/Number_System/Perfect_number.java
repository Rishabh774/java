package Number_System;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int temp =num;
        int sum =0;
        for (int i = 1; i <=num/2 ; i++) {
            if(num%i==0){
                sum+=i;
            }
        }
        if (sum == temp){
            System.out.println("Number is perfect number ");
        }
        else {
            System.out.println("Number is not  perfect number ");
        }
    }
}
