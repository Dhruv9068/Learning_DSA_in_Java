package com.questions;

public class MinNumberOfFlips {
    public static void main(String[] args) {
        String S = "0010001";
        System.out.println(minFlips(S));
    }
    static int minFlips(String S) {
        int n = S.length();
        int flip = 0;
        int i = 0;
        while(i < n){
            char expected_char = i % 2 == 0 ? '1' : '0';
            if(S.charAt(i) == expected_char) flip++; i++;
        }
        return Math.min(n-flip, flip);
    }
}
