package com.Patterns;



//        *
//        *  *
//        *  *  *
//        *  *  *  *
public class StarRightAngletraingle {
    public static void main(String[] args) {
        int n =5;
        for(int row =0; row < n; row ++){
            for( int cols =0; cols< row; cols++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
