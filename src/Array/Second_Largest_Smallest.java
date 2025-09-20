package Array;

import java.util.Scanner;
//In this code if length of array is smaller than 2 second smallest and largest will be -1
public class Second_Largest_Smallest {
    static int second_largest(int arr[]){
       int max= Integer.MIN_VALUE;
       int smax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            } else if (arr[i]>smax && max!=arr[i]) {
                smax=arr[i];
            }
        }
        return (smax==Integer.MIN_VALUE) ?-1: smax;
    }
    static int second_smallest(int arr[]){
       int min= Integer.MAX_VALUE;
       int smin=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            } else if (smin>arr[i] && min!=arr[i]) {
                smin=arr[i];
            }
        }
        return (smin==Integer.MAX_VALUE)?-1:smin;

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
        System.out.println(second_largest(arr));
        System.out.println(second_smallest(arr));
    }
}
