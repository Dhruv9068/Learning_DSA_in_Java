package com.Patterns;

public class ReverseRIghtangletrainagled {
    public static void main(String[] args) {

        int n = 5;
        int i, j;
        for (i = 0; i < n; i++) //outer loop for number of rows(n)
        {
            for (int k =0; k< 2*(n - i) ; k++) // inner loop for spaces
            {
                System.out.print(" "); // printing space
            }
            for (j = 0; j <= i; j++) //  inner loop for columns
            {
                System.out.print("* "); // print star
            }
            System.out.println(); // ending line after each row
        }
    }
}

