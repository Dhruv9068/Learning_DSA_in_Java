package com.questions;

import java.util.Arrays;

public class Kth_Smallest_element {
    public static void main(String[] args) {
        int [ ] arr = {5,4,8,2,1};
        int k =3;
        System.out.println(KthSmallestElement(arr , k));
    }
    static int KthSmallestElement(int [] arr , int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}
