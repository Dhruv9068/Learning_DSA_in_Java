package com.concept;

import java.util.Scanner;

public class Nested_switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// Suppose we have a category
        int category = in.nextInt();
        switch (category) {
            case 1:
                System.out.println("Category 1: Electronics");
                break;
            case 2:
                System.out.println("Category 2: Clothing");

                // Nested switch statement for subcategories within Clothing
                int subCategory = in.nextInt(); // Suppose we have a subcategory
                switch (subCategory) {
                    case 1:
                        System.out.println("Subcategory 1: Men's Clothing");
                        break;
                    case 2:
                        System.out.println("Subcategory 2: Women's Clothing");
                        break;
                    default:
                        System.out.println("Invalid subcategory");
                }
                break;
            case 3:
                System.out.println("Category 3: Books");
                break;
            default:
                System.out.println("Invalid category");
        }
    }
}
