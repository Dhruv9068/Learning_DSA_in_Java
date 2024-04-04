package first_ideaprogram.src.OOPS.SortingAlgos;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        Selection_withMin(arr);
        int[] arr1 = {5,4,6,3,8,2};
        Selection_withMax(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    public static void Selection_withMin(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the remaining unsorted portion
            int min_index = findMinIndex(arr, i, n );

            // Swap the found minimum element with the first element
            swap(arr, i, min_index);
        }
    }

    static int findMinIndex(int[] arr, int start, int end) {
        int min_index = start;
        for (int i = start; i <end; i++) {
            if (arr[i] < arr[min_index]) {
                min_index = i;
            }
        }
        return min_index;
    }

    static void Selection_withMax(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = n - 1; i > 0; i--) {
            // Find the index of the maximum element in the unsorted portion
            int max_index = findMaxIndex(arr, 0, i);

            // Swap the found maximum element with the last unsorted element
            swap(arr, i, max_index);
        }
    }

    static int findMaxIndex(int[] arr, int start, int end) {
        int max_index = start;
        for (int i = start ; i <= end; i++) {
            if (arr[i] > arr[max_index]) {
                max_index = i;
            }
        }
        return max_index;
    }



    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
