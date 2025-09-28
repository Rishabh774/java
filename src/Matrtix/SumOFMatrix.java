package Matrtix;

import java.util.Scanner;

public class SumOFMatrix {
    static int sumMatrix(int mat[][]){
        int sum =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                sum+=mat[i][j];
            }
        }
        return sum;
    }
    static void printMatrix(int mat[][]){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns :");
        int cols = sc.nextInt();
        System.out.println("Enter "+rows*cols+" elements");
        int [][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]= sc.nextInt();
            }
        }
        printMatrix(matrix);
        System.out.println("Sum of matrix elements "+sumMatrix(matrix));
    }
}
