package Recursion;

public class SUM {
    public static void main(String[] args) {
        System.out.println(Sum(1000));
    }
    static int Sum(int n){
        return n <=1 ? 1 : n + Sum(n-1);
    }
}
