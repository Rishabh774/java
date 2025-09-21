package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSubsets {
    public static void main(String[] args) {
        String str= "abc";
        List<String> li= new ArrayList<>();
        String ans="";
        subsets(ans,str, 0,li);
        Collections.sort(li);
        System.out.println(li);
    }

    private static void subsets(String ans, String str, int idx,List<String> li) {
        if (idx==str.length()){
          if(ans.length()!=0) li.add(ans);
            return;
        }
        char ch = str.charAt(idx);
        subsets(ans+ch, str,idx+1,li);
        subsets(ans,str,idx+1,li );
    }
}
