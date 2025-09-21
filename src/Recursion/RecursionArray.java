package Recursion;

public class RecursionArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,67,8,910,11};
       // printrec(arr,0);
        System.out.println(exists(arr,8,0));
    }
    static void printrec(int arr[], int idx){
        int n =arr.length;
        if(idx==n) return ;
        printrec(arr, idx+1);
        System.out.print(arr[idx]+" ");
       // printrec(arr, idx+1);
    }
    static boolean exists(int arr[], int target , int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==target) return true;
        return exists(arr, target, idx+1);
    }
}
