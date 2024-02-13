package com.concept;

public class Functions_or_methods {

    /* syntax


         return_type (arguments){
         body
         return statements;



     */


    public static void main(String[] args) {
        String G=greet();
        System.out.println(G);
    }

    static String greet(){
        String greeting = "Hello brother";
        return greeting;

    }
}
