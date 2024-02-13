package Recursion;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int [] arr ={ 4,3,2,1};
        SelectionSort(arr , arr.length , 0 ,0);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSort (int [] arr , int r , int c , int max){
        if(r == 0) return;
        if(c < r) {
            if (arr[c] > arr[max]) {
                //swap the c element to maximum
                SelectionSort(arr, r, c + 1, c);
            } else {
                SelectionSort(arr, r, c + 1, max);
            }
        }
          // now change the row again so c=0 ,max =0 and swap the last element of which is that row -1  with max

        else{
           int temp = arr[max];
           arr[max] = arr[r-1];
           arr[r-1] = temp;
           SelectionSort(arr, r-1 , 0 , 0);

        }

    }

}
