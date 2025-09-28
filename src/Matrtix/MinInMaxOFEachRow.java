package Matrtix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinInMaxOFEachRow {
    static void MinInMaxOFEachRow(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int max =0;
            for (int j = 0; j < m; j++) {
                if (mat[i][j]>max) {
                    max=mat[i][j];
                    ans.add(max);
                }
            }
        }
        int result = Collections.min(ans);
        System.out.println("Minimum among them: " + result);
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
        MinInMaxOFEachRow(matrix);
    }
}
