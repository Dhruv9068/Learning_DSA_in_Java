package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

//    public static void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//            int pi = partition(arr, low, high);
//
//            quickSort(arr, low, pi - 1);
//            quickSort(arr, pi + 1, high);
//        }
//    }
//
//    public static int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int i = (low - 1);
//        for (int j = low; j < high; j++) {
//            if (arr[j] < pivot) {
//                i++;
//
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//
//        int temp = arr[i + 1];
//        arr[i + 1] = arr[high];
//        arr[high] = temp;
//
//        return i + 1;
//    }
//}


static void quickSort(int [] arr , int low , int high){
        if(low >= high)  return;
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;

        int pivot = arr[mid];
        while(start <= end ){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot ){
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(arr , low , end);
        quickSort(arr, start , high);

    }
}
