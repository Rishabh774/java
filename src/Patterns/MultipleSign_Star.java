package Patterns;

import java.util.Scanner;

public class MultipleSign_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of edges :");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j=1; j<= n ;j++){
               if(j==i){
                   System.out.print ("* ");
               }
            }
            System.out.println();
        }

    }
}
