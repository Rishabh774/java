package Array;

public class product {
    static  int product(int arr[]){
        int ans =1;
        for (int i = 0; i < arr.length; i++) {
            ans *= arr[i];
        }
        return  ans;
    }
    public static void main(String[] args) {
        int arr []= { 10,10,2,2};
        System.out.println("Product of array elements is :"+product(arr));
    }
}
