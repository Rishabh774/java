package Array;

import java.util.Scanner;

public class MaxAndMin {
    static int min(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static int max(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
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
        System.out.println("Maximum of array is " +max(arr)+" and minimum is "+min(arr));
    }
}
