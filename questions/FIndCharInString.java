package com.questions;

public class FIndCharInString {
    public static void main(String[] args) {
        String str = "kunal";
        System.out.println(StringSearch(str, 'u'));
    }


    static int StringSearch(String str, char target) {
        if (str.length() ==0){
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return i;
            }


        }
   return -1; }
}