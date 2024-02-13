package com.BitManipulation;

public class PositionOfsetbitFromRIght {
    public static void main(String[] args) {
        int b = 13;
        int k = 2;
        System.out.println(setbitpos(b, k));
    }

    static int setbitpos(int b, int k) {
        int position =1;
        int mask =1;

       while((b & mask) ==0){
         mask <<=1;
         position++;
       }
   return position; }
}
