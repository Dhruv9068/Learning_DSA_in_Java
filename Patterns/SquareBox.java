package com.Patterns;



//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *
public class SquareBox {
    public static void main(String[] args) {
        int n =5;
        for(int row =0; row < n; row ++){
            for( int cols =0; cols<n; cols++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
