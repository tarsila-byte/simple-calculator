package operations;

import utils.InputHelper;
import utils.MenuNavigator;

public class Subtraction {
    public static void subtract() {
        System.out.println("""
        
        -------------------------------------------------------------
        ==== OPERATION 2 - SUBTRACTION ===
        """);

        double num1 = InputHelper.readDouble("Enter the first number: ");
        double num2 = InputHelper.readDouble("Enter the second number: ");

        double result = num1 - num2;
        System.out.printf("Calculation:\n%.2f - %.2f = %.2f", num1, num2, result);

        MenuNavigator.askToReturn();
    }
}