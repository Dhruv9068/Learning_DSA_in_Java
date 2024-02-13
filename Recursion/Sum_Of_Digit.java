package Recursion;

public class Sum_Of_Digit {
    public static void main(String[] args) {
        System.out.println(SumOfDigit(15666));
    }
    static int SumOfDigit(int n){
        return n==0 ? 0 : SumOfDigit(n/10) + n% 10;
    }
}
