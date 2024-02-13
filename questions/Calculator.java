package com.questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        // Take input from user till does not press X or x
        int ans=0;

        while(true){
            System.out.println("enter operation:");
            char op = in.next().trim().charAt(0);
            if (op=='+' || op == '-' || op =='*' || op == '/' || op == '%'){
                System.out.println("operator Two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;

                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("denominator must not be zero");
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }


            }
            else if (op == 'X' || op == 'x') {
                break;
            }
            else{
                System.out.println("operator entered is invalid");
            }
            System.out.println(ans);
        }
        }

    }

