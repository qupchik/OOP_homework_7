package decorator;

import java.util.Scanner;

// CalculatorWithHistory реализует интерфейс CalculatorDecorator.
public class CalculatorWithHistory implements CalculatorDecorator {
    private final CalculatorDecorator calculator;

    public CalculatorWithHistory(CalculatorDecorator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double calculate(double a, double b) {
        System.out.print("Do you want to use the previous result? (y/n) ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            a = calculator.getResult();
            System.out.print("Enter second number: ");
            b = scanner.nextDouble();
        }
        double result = calculator.calculate(a, b);
        calculator.setResult(result);
        return result;
    }

    @Override
    public void setResult(double result) {
        calculator.setResult(result);
    }

    @Override
    public double getResult() {
        return calculator.getResult();
    }
}