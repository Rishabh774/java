package Array;

import java.util.Scanner;

public class LeftAndRightRotationOfElements {
    static void reverse(int arr[],int i, int j){

        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void leftrotation(int arr[], int k){
        int n = arr.length;
       k=k%n;

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

    }
    static void rightrotation(int arr[], int k){
        int n = arr.length;
        k=k%n;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);


    }
    static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
        leftrotation(arr,2);
        //rightrotation(arr,3);
        printarr(arr);
    }
}
