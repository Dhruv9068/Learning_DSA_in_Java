package com.concept;

import java.util.Scanner;

public class TypeConversion {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
      //  float num = input.nextFloat();
      //  System.out.println(num);

        //type Casting
        int newInteger = (int)(35.56f);
        System.out.println(newInteger);


        //automatic type promotion in expressions
        int a =257;
        byte b = (byte) (a);
        System.out.println(b);    // 257 %256 =1 because the range of byte is 256


        byte c =40;
        byte d= 50;
        byte e= 100;
        int F = (c*d)/e;  // it convert the c*d automatically into integer
        System.out.println(F);



        // converting charactor to integer (ASii values)

        int number ='A';
        System.out.println(number);


        int I= 42;
        char C ='a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double D = 0.1234;
        double result = (f*I) + (i/C)- (D-s);
        // float + int - Double = Double
        System.out.println((f*I) + " " +(i/C) + " " + (D-s));
        System.out.println(result);




    }
}
