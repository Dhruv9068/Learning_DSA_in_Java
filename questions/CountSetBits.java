package com.questions;

public class CountSetBits {
    public static void main(String[] args) {
        int count =0;
        int n=7;
        while(n>0){
            count++;
            // n-= (n & (-n));  or
            n = n & (n-1);
        }
        System.out.println(count);
    }
}
