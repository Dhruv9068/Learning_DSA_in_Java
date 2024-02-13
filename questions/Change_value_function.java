package com.questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Change_value_function {
    public static void main(String[] args) {
        // creating an array
        int [] arr ={9,12,11,5,4};
        changearr(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void changearr(int[] nums){
        nums[0]=99; // if we pass value via reference variable the value get changed

    }
}
