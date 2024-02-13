package com.questions;

public class FunctionToCheckEvenDigitsOrNot {

    public static void main(String[] args) {

        int num=554;
        System.out.println(CheckdigitEven(num));

    }

    static boolean CheckdigitEven(int  num){
        int numsofdigit =digits(num);
        if(numsofdigit%2==0){
            return true;
        }
        return false;
    }

    //count number of digits in a number
    static int digits (int nums){
        return (int)(Math.log10(nums))/10;
    }
}
