package Array;

import java.util.Scanner;

public class ReverseArray {
    static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reverse(int arr[]){
        int i=0;
        int j =arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();

        int arr[]= new int[n];
        System.out.println("Enter "+n+" elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.print("Original Array: ");
        printarr(arr);
        reverse(arr);
        System.out.print("Reversed Array: ");
        printarr(arr);

    }
}
