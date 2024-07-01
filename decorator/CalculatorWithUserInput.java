package decorator;

import java.util.Scanner;

// CalculatorWithUserInput реализует интерфейс CalculatorDecorator.
public class CalculatorWithUserInput implements CalculatorDecorator {
    private final CalculatorDecorator calculator;
    private final Scanner scanner;

    public CalculatorWithUserInput(CalculatorDecorator calculator) {
        this.calculator = calculator;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public double calculate(double a, double b) {
        System.out.print("Enter first number: ");
        a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        b = scanner.nextDouble();
        return calculator.calculate(a, b);
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