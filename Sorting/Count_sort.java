package Sorting;

import java.util.Arrays;

public class Count_sort {
    public static void main(String[] args) {
    int [] arr = {5,4,3,2,1,1,5,6};
    countSort(arr);
    System.out.println(Arrays.toString(arr));

    }
    static void countSort(int[] arr) {
        int Max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > Max) {
                Max = num;
            }
        }
        int[] CountArray = new int[Max + 1];
        for (int n : arr) {
            CountArray[n]++;
        }
        int index = 0;
        for (int i = 0; i <= Max; i++) {
            while (CountArray[i] > 0) {
                arr[index] = i;
                index++;
                CountArray[i]--;
            }
        }
    }

}

