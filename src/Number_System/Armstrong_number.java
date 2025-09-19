package Number_System;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        int temp =num;
        int length = String.valueOf(num).length();
        int ans =0;
        while(temp!= 0){
            int rem = temp%10;
            ans +=Math.pow(rem,length);
            temp /=10;
        }
        if (num==ans){
            System.out.println("Number is armstrong " );
        }
        else {
            System.out.println("Number is not  armstrong " );
        }

    }
}
