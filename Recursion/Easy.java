package Recursion;

public class Easy {
    public static void main(String[] args) {
        Fun(5);
        System.out.println();  // Move to the next line
        FunRev(5);
        System.out.println();  // Move to the next line
        FunBoth(5);
    }

    static void Fun(int n){
        if(n == 0) return;
        System.out.println(n);  // Print on a new line

        Fun(n-1);
    }

    static void FunRev(int n){
        if(n == 0) return;

        FunRev(n-1);
        System.out.println(n);  // Print on a new line
    }

    static void FunBoth(int n){
        if(n == 0) return;

        System.out.println(n);  // Print on a new line
        FunBoth(n-1);
        System.out.println(n);  // Print on a new line
    }
}
