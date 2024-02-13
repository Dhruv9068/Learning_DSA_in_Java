package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Fact(5));
    }
    static int Fact (int num){
//        if(num <=1) return num;
//        return num * Factorial(num-1);
        return num<=1 ? num : num*(Fact(num-1));
    }
}
