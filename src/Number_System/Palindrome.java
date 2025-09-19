package Number_System;


import java.util.*;
// using for loop we can find total number of palindrome numbers in a given range
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        int temp = num;
        int rev =0;
        while(temp !=0){
            int rem = temp%10;
            rev = rev*10 +rem;
            temp/=10;

        }
        if (num==rev){
            System.out.println("Number is palindrome " );
        }
        else {
            System.out.println("Number is not  palindrome " );
        }
    }
}
