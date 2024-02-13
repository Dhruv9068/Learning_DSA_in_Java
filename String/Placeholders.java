package String;

import java.text.MessageFormat;

public class Placeholders {
    public static void main(String[] args) {
        // Example 1: Printing an integer using %d placeholder
        int number = 42;
        System.out.printf("The number is: %d%n", number);

        // Example 2: Printing a floating-point number using %f placeholder with two decimal places
        double value = 3.14;
        System.out.printf("The value of pi is: %.2f%n", value);

        // Example 3: Printing a string using %s placeholder
        String name = "Alice";
        System.out.printf("Hello, %s!%n", name);

        // Example 4: Printing a character using %c placeholder
        char grade = 'A';
        System.out.printf("Your grade is: %c%n", grade);

        // Example 5: Printing a boolean using %b placeholder
        boolean isJavaFun = true;
        System.out.printf("Java is fun: %b%n", isJavaFun);

        // Example 6: Printing text with a newline using System.lineSeparator()
        System.out.print("This is the first line." + System.lineSeparator() + "This is the second line." + System.lineSeparator());


        
    }
}
