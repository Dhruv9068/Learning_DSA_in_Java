package com.questions;

import java.util.Scanner;

public class Find_largest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        System.out.println("Maxmimum of Threee numbers is " + max);

        // use of Math.max function
        int MAX = Math.max(55, Math.max(55,34));
        System.out.println("Maxmimum of Threee numbers is " + MAX);


    }
}
