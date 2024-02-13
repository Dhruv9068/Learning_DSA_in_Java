package Recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(IsPalindrome(121));
        System.out.println(IsPalindrome(123));
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
    static boolean IsPalindrome(int n){
        return n== Reverse(n);
    }
}
