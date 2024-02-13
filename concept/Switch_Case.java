package com.concept;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String fruit = in.next();


        switch (fruit) {
            case "Mango":
                System.out.println("Case 1 mango");
                break;
            case "Apple":
                System.out.println("Case 2 mango");
                break;
            case "Orange":
                System.out.println("Case 3 orange");
                break;
            default:
                System.out.println("please enter valid fruit");


        }


        //another method languge 11+
       int day = in.nextInt();
        /* switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day");
        }*/
        switch (day) {
            case 1:

            case 2:

            case 3:
                System.out.println("Case 1 or 2 or3 ");
                break;
            default:
                System.out.println("please enter");


        }


    }
}
