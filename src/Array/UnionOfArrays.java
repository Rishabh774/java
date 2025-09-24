package Array;

import java.util.Collections;
import java.util.HashSet;

public class UnionOfArrays {
    static HashSet<Integer> union(int arr1[], int arr2[]){
        HashSet<Integer> ans = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            ans.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            ans.add(arr2[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
//        arr1 = [1, 2, 3, 4, 5, 6, 7, 8, 9]
//        arr2 = [1, 2, 10, 20, 6, 8, 10, 20]
//
//        Union = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20]
        int arr1[]={1,2,3,4,5,6,7,8,9};
        int arr2[]={1,2,10,20,6,8,10,10,20};
         HashSet<Integer> ans = union(arr1,arr2);

        System.out.println(ans);

    }
}
