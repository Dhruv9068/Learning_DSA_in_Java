package com.concept;

import java.util.Scanner;

public class Inputs {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some inputs: ");
        int roll_no = input.nextInt();
        System.out.println("Your roll number is " + roll_no);
        System.out.println("Enter your name");

        String name= input.next();
        System.out.println("The entered name is " + name);

        float marks = input.nextFloat();
        System.out.print("Your entered marks in float are " + marks);

        double Marks  = input.nextDouble();
        System.out.print("Your entered marks in Double are " + Marks);

    }
}
