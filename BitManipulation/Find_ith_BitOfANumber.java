package com.BitManipulation;

public class Find_ith_BitOfANumber {
    public static void main(String[] args) {
        int b = 1011011;
        int k =4 ;
        System.out.println(Findbit( b , k));
    }
    static int Findbit(int b , int k){
        int mask =(b >> k);
        int result =  mask & 1;


   return result;
    }
}
