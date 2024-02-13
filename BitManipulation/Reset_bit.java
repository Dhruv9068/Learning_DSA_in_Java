package com.BitManipulation;

public class Reset_bit {

    public static void main(String[] args) {
        int b = 13;
        int k = 2;
        System.out.println(Resetbit(b, k));
    }

    static int Resetbit(int b, int k) {
        int bitmask = ~(1 << (k));
        return (bitmask & b);
    }
}
