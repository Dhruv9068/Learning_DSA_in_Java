package Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(Reverse(1824));
    }
    static int Reverse(int n){
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n ,digit);
    }
    static int helper(int n , int digit){
        if( n<10) return n;
        int rem = n%10;
        return  rem * (int) (Math.pow(10,digit-1)) + helper(n/10 , digit-1) ;
    }

}
