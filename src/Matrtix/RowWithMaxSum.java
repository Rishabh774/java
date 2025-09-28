package Matrtix;

import java.util.Scanner;

public class RowWithMaxSum {
    static void rowWithMaxSum(int mat[][]){
        int max=0;
        int row =0;
        for (int i = 0; i < mat.length; i++) {
            int sum =0;
            for (int j = 0; j <mat[0].length ; j++) {
                sum+=mat[i][j];
                max = Math.max(sum,max);
                row=i;

            }
        }
        System.out.println("Maximum sum is "+ max);
        System.out.println("Maximum sum row is "+(row+1));
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
        rowWithMaxSum(matrix);
    }
}
