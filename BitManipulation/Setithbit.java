package com.BitManipulation;

public class Setithbit {
    public static void main(String[] args) {
        int b = 86;
        int k = 4;
        System.out.println(Setbit(b, k));
    }

    static int Setbit(int b, int k) {
        return ((1 << (k-1)) | b);
    }
}
