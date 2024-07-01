package view;

import java.util.Scanner;

public class CalculatorView {
    private static final Scanner scanner = new Scanner(System.in);

    public double getFirstNumber() {
        System.out.print("Enter first number: ");
        return scanner.nextDouble();
    }

    public double getSecondNumber() {
        System.out.print("Enter second number: ");
        return scanner.nextDouble();
    }

    public String getOperation() {
        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Raise to power (a^b)");
        System.out.println("6. Square Root (sqrt(a))");
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine().trim();

        // Очистка буфера ввода
        while (!choice.matches("^\\d+$")) {
            // System.out.println("Invalid choice, please try again.");
            choice = scanner.nextLine().trim();
        }

        return choice;
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
        System.out.println();
    }

    public boolean useLastResult() {
        System.out.print("Do you want to use the last result? (y/n) ");
        String choice = scanner.nextLine().trim().toLowerCase();
        if (choice.equals("y") || choice.equals("n")) {
            return choice.equals("y");
        } else {
            System.out.println("Invalid choice, please try again.");
            return useLastResult();
        }
    }
}