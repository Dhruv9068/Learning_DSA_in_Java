package com.questions;

import java.util.Scanner;

public class Fibbonacci_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int i = 2;
         while(i<=n){
             int temp=b;
             b = b + a;
             a = temp;
             i+=1;
         }

         System.out.println(b);


     }
    }

