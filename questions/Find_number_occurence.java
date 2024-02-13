package com.questions;

public class Find_number_occurence {
    public static void main(String[] args) {
        int n = 1234524552;
        int count=0;
        while (n>0){
            int rem = n%10;
            if (rem == 2){
                count++;
            }
            n=n/10;
        }
        System.out.print("Occurence of 2 is: " + count);

    }




}
