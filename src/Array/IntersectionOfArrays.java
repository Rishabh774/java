package Array;

import java.util.HashSet;

public class IntersectionOfArrays {
    static HashSet<Integer> intersection(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);

        }
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])){
                intersection.add(arr2[i]);
            }
        }
        return intersection;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9};
        int arr2[]={1,2,10,20,6,8,10,20};
        HashSet<Integer> ans  =intersection(arr1,arr2);
        System.out.println(ans);
    }
}
