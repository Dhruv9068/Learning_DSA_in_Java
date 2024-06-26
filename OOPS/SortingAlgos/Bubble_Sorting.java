package first_ideaprogram.src.OOPS.SortingAlgos;

import java.util.Arrays;

public class Bubble_Sorting {
    public static void main(String[] args) {
int[] arr ={1,2,3,4,5};
bubble(arr);
System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr){
// run the steps n-1 times
        boolean swapped;
        for(int i=0;i< arr.length;i++){
            swapped =false;
            // for each step , max item will come at the last respective index
            for(int j =1; j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap if the item is smaller than the previous item
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
            // if you did not swap for a particular value of i , it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }
}
