package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n;i++){
            for(int j=i+1; j<n;j++){
                for(int k=j+1 ; k<n ; k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(triplet);
                        if(!list.contains(triplet))
                            list.add(triplet);
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,4,-1};
        System.out.println(threeSum(arr));
    }
}
