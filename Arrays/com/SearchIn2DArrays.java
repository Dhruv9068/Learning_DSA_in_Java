package Arrays.com;

import java.util.Arrays;

public class  SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {1, 2, 3},
                {44, 5, 6}
        };
        int target = 3;
        int[] indices = Searchelement(arr, target);
        if (indices != null) {
            System.out.println(Arrays.toString(indices));
        } else {
            System.out.println("Target element not found in the array.");
        }
    }

    static int[] Searchelement(int[][] arr, int target) {
        if (arr.length == 0 || arr[0].length == 0) {
            throw new IllegalArgumentException("Input array is empty or null.");
        }

        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == target) {
                    // Return indices as an array when the target is found
                    return new int[]{i, j};
                }
            }
        }

        // Return null if the target is not found
        return null;
    }
}
