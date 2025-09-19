package Patterns;

import java.util.Scanner;

public class Alphabet_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int n = sc.nextInt();
        for (int i = 0; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((char)(j+96)+" ");// j+64 for capital letter
            }
            System.out.println();
        }
    }
}
