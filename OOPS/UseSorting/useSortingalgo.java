package first_ideaprogram.src.OOPS.UseSorting;
import first_ideaprogram.src.OOPS.SortingAlgos.*;


import java.util.Arrays;

public class useSortingalgo {
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        int [] arr1 ={5,4,3,2,1};
        int [] arr2 ={5,4,3,2,1};
        Bubble_Sorting.bubble(arr);
        QuickSort.quickSort(arr1 , 0 , arr1.length-1);
        InsertionSort.instertion(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
