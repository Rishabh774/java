package Number_System;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prime_In_Range {

    static  boolean isprime(int num ){
        if(num <=1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if(num%i==0){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting point :");
        int  num1= sc.nextInt();
        System.out.print("Enter ending point :");
        int num2 = sc.nextInt();
        for (int i = num1; i <num2; i++) {
            if (isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
