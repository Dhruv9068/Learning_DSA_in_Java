package com.Patterns;

public class NumberDimond {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row <= 2*n; row++) {
            int C = row > n ? 2*n -row : row;
            for (int space = 0; space < n - C; space++) {
                System.out.print("  ");
            }
            for (int cols =C ; cols >= 1; cols--) {
                System.out.print(cols + " ");
            }
            for (int cols = 2 ; cols <= C; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
