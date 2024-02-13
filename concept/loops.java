package com.concept;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num += 1) {
            System.out.println("number is " + num);

        }
        System.out.println("\n");
        System.out.println("now give range by user input");
        System.out.println("\n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        for (int num = 1; num <= n; num += 1) {
            System.out.println("number is " + num);

        }
        System.out.println("\n");

        //while loops
        int number = 1;
        while (number <= 5) {
            System.out.println("number in while is " + number);
            number += 1;
        }

        System.out.println("\n");
        // do while loops
        int numb=1;
        do{
            System.out.println("Hello world");
            numb++;
        } while(numb != 3);

    }
}




