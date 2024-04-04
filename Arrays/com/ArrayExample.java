package Arrays.com;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        // array syntax
        // datatype[] arrayname = new datatype[size];
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr1 = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;
        arr[4] = 25;
        System.out.println(arr[3]);

        // Input array arr1 using for loop
        System.out.println("Enter values for arr1:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }

        // Print arr1 using for loop
        System.out.print("arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Input array arr using for-each loop
        System.out.println("\nEnter values for arr:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // Print arr using for-each loop
        System.out.print("arr: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Array string method to print
        System.out.println("\narr as a string: " + Arrays.toString(arr));

        // array of objects

        String [] StringArr = new String[5];
        for (int i = 0; i < StringArr.length; i++) {
            StringArr[i] = in.next();
        }

        System.out.print(Arrays.toString(StringArr));


        // Close the scanner
        in.close();

    }
}
