package com.BitManipulation;

public class FindDublicatesInTheArray {
    public static void main(String[] args) {
        int [] arr = {1,2,1,2,5,6,6,8,8};
        System.out.println(FindSingleElement(arr));
    }

    static int FindSingleElement( int [] arr){
int unique =0;
for( int n : arr){
    unique ^= n;
}

     return unique;}


}
