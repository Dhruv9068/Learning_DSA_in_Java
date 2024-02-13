package com.Patterns;

public class NumberSquareBox {
    public static void main(String[] args) {

        int org_n = 5;
        int n= 2*org_n;
        for (int row = 0; row <= n; row++) {
            for (int cols = 0; cols <= n; cols++) {
                int atEveryIndex = Math.min(Math.min(row, cols), Math.min(n - row, n - cols));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();

        }
        System.out.println();

        for (int row = 0; row <= n; row++) {
            for (int cols = 0; cols <= n; cols++) {
                int atEveryIndex = org_n- Math.min(Math.min(row, cols), Math.min(n - row, n - cols));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();

        }

    }
}
