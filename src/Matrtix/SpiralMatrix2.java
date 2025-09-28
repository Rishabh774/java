package Matrtix;

import java.util.Scanner;

public class SpiralMatrix2 {
    static int[][] generateMatrix(int n) {
        int rows =n-1;
        int cols=n-1;
        int ans [][]=new int [n][n];
        int fr =0, lr=n-1, fc=0, lc=n-1;
        int k=1;
        while(fr<=lr && fc<=lc){
            for(int i=fc; i<=lc && i<n;i++){
                ans[fr][i]=k;
                k++;
            }
            fr++;
            for(int i=fr; i<=lr && i<n;i++){
                ans[i][lc]=k;
                k++;
            }
            lc--;
            for(int i=lc; i>=fc && i<n; i--){
                ans[lr][i]= k;
                k++;
            }
            lr--;
            for(int i=lr ;i>=fr&& i<n;i--){
                ans[i][fc]=k;
                k++;
            }
            fc++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
       int ans [][]= generateMatrix(num);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(ans[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
