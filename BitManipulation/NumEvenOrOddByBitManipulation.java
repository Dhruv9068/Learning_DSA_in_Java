package com.BitManipulation;

public class NumEvenOrOddByBitManipulation {

    public static void main(String[] args) {
        int num =203;
        System.out.println(Evenorodd(num));
    }
    static boolean Evenorodd(int num){
        return (num & 1) == 0;
    }
}
