package Arrays.com;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimesnionalArray {
    public static void main(String[] args) {

        /*
            1 2 3
            4 5 6
            7 8 9
         */
        Scanner in = new Scanner(System.in);
        // int[] [] arr = new int[3][3];

        /* int[][] arr={ {1,2,3},// 0th index
                      {4,5,}, // 1 st index
                      {6,7,8,9} // 2nd index
        };  */

         int[] [] array = new int[3][3];
        // input 2D array
        for(int row =0; row < array.length; row++){
            for (int col =0;col<array[row].length;col++){
                array[row][col]=in.nextInt();
            }
        }

        //print 2d array
        for(int row =0; row < array.length; row++){
            for (int col =0;col<array[row].length;col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Using ArrayString method now print");
        // arrayString method
        for(int row =0; row < array.length; row++){
            System.out.println(Arrays.toString(array[row]));
        }

        System.out.println("Using foreach with ArrayString method to print");
        // arrayString method
        for(int[] a : array){
            System.out.println(Arrays.toString(a));
        }
    }
}
