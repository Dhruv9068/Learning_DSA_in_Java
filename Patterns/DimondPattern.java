package com.Patterns;

public class DimondPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < 2 * n; row++) {

            int totalcolsInrow = row > n ? 2*n -row : row;
            int totalSpace = n-totalcolsInrow;
            for (int s =0; s< totalSpace ; s++){
                System.out.print(" ");
            }
            for (int cols = 0; cols < totalcolsInrow; cols++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
