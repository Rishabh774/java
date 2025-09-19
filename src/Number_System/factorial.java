package Number_System;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        int fact =1;
        if (num<0){
            System.out.println("factorial of negative numbers is not defined :");
        }
        if(num==0 && num ==1 ){
            System.out.println("Factorial is 1");
        }
        for (int i = 1; i <=num ; i++) {
            fact*=i;
        }
        System.out.println( "Factorial of "+num+" is : "+fact);
    }
}
