package com.concept;

public class Function_overloading {
    public static void main(String[] args) {
        fun(5);
        fun("hello");
    }



    // two function of same name exist , if they have different arguments
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String v){
        System.out.println(v);
    }
}
