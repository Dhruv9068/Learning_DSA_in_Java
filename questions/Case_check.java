package com.questions;

import java.util.Scanner;


// question return the first charctor of entered string
public class Case_check {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         char ch = in.next().trim().charAt(0);
         System.out.println("the first alphabate of string is :" + ch);
    }
}
