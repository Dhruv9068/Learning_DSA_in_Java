package Sorting;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 5, 0};
        System.out.println(Arrays.toString(mergesort(arr)));
        mergesortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr) {
        if (arr.length == 1) return arr;

        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }

    static void mergesortInplace(int[] arr, int s, int e) {
        if (e - s <= 1) return;

        int mid = s + (e - s) / 2;
        mergesortInplace(arr, s, mid);
        mergesortInplace(arr, mid, e);

        mergeInplace(arr, s, mid, e);
    }

    static void mergeInplace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s, j = mid, k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
