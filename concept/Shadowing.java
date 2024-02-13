package com.concept;

public class Shadowing
{   static int a=10;   // it can be use all over the scope of class but ,this a will shadowed in line 8 .
    static int b=20;

    public static void main(String[] args) {
        System.out.println("outside main module a is: " + a);
         a=20;
         int a;  // the class varibale at line 4 will shadowed by this
        // System.out.println(a); it will shows error becouse a is not intialised , the scope starts from where a is intialised
        a=50;
        System.out.println("inside main module a is: " + a);  // class variable line 4 is shadowed here
        fun();


    }
    static void fun(){
        System.out.println("outside main module and inside fun function a is: "+ a);
    }
}
