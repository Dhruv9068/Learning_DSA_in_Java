package com.Patterns;

public class NumberParamid {
    public static void main(String[] args) {
        int n =5;
        for(int i =0;i<= n ; i++){
            for (int space =0; space < n -i; space++){
                System.out.print("  ");
            }
            for(int cols = i; cols >=1 ; cols--){
                System.out.print(cols + " ");
            }
            for (int cols = 2; cols <= i ; cols++){
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
