package Array;

public class SubArrays {
    static void SubArrays(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        SubArrays(arr);
    }
}
