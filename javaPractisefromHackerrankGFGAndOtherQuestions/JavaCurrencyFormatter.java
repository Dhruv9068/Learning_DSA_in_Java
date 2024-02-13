package com.javaPractisefromHackerrankGFGAndOtherQuestions;
import java.util.*;
import java.text.*;
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        scanner.close();

        // format of us
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(amount);

        // Format for India
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = indiaFormat.format(amount);

        // Format for China
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(amount);

        // Format for France
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(amount);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
