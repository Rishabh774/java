package Array;

import java.util.Scanner;

public class MoveZerosEnd {
    static void movezeros(int arr[]){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<arr.length){
            arr[count++]=0;
        }

    }
    static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter "+n+" elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        movezeros(arr);
      printarr(arr);
    }
}
