package Number_System;

public class Prime {
    static  boolean isprime(int num ){
        if(num <=1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if(num%i==0){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n =170;
      boolean ans =  isprime(n);
        System.out.println(ans);
    }
}
