package com.Patterns;

public class RowCountingPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <=n; row++) {
            for (int cols = 1; cols <= row; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
