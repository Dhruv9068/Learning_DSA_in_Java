package com.Patterns;

public class HorizontalParamid {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < 2 * n; row++) {

            int totalcolsInrow = row > n ? 2*n -row : row;
            for (int cols = 0; cols < totalcolsInrow; cols++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
    }
}
