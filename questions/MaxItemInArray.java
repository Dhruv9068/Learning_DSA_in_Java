package com.questions;

public class MaxItemInArray {
    public static void main(String[] args) {
        int [] arr ={ 1, 2,3,4,5};
        System.out.println(MaxRange(arr ,0,4));
    }
    static int MaxRange(int [] arr , int start , int end){
        int max_value = arr[0];
        for (int i =0 ;  i< arr.length ; i++) {
            if (arr[i] > max_value) {
                max_value = arr[i];

            }
        }
            return max_value;

    }
}
