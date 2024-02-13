package Recursion;

public class PredictOutput_1 {
    public static void main(String[] args) {
        f(5);
    }
    static void f(int n){
        if(n==0) return;
        System.out.println(n);
       // f(n--);  it prints infinite times 5 even not decrementing
        // n--  it pass the value in function first then decrement , but in recursion it never end function call like this result infinite recursion
        f(--n);
        // --n  it first decrement then value then pass it to the function
    }
}

