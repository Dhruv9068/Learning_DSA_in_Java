package com.concept;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Varibale_length_Arguments {
    public static void main(String[] args) {
        fun(2,3,4,4,5,5,6,6,767,77);
        fun(); // empty array
        multiple( 2, 4 , "Rahul","dhruv","ahana", "no", "ok");
    }
    static void fun(int ...v) // by ...v it can take any number of arguments from call as array
    {
        System.out.println(Arrays.toString(v)); // prints them like array
    }
    static void multiple(int a, int b, String ...V)  // Variable length arguments always at the end
    {
        System.out.println(a +" "+ b+ " " + Arrays.toString(V));

    }
}
