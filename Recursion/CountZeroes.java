package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(Count(1020400));
        System.out.println(Count(0));
        System.out.println(Countf(14));
    }

   static int Count(int n){
        int C=0;
        return n==0? C=1: Helper(n, C);
   }
    static int Helper(int n , int C){
        if(n==0) return C;

        return   n%10 == 0 ? Helper(n/10 , C+1) : Helper(n/10 , C);
    }

    static int Countf(int n){
        int C=0;
        return Helperf(n, C);
    }
    static int Helperf(int n , int C){
        if(n==0) return C;

        return   n%2 == 0 ? Helperf(n/2 , C+1) : Helperf(n-1 , C+1);
    }
}
