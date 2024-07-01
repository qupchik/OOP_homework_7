package decorator;

import model.Calculator;
import operations.Operation;

// BasicCalculator наследуется от Calculator и реализует интерфейс CalculatorDecorator.
public class BasicCalculator extends Calculator implements CalculatorDecorator {
    private double result;

    public BasicCalculator(Operation operation) {
        // Вызываем конструктор суперкласса Calculator, передавая операцию.
        super(operation);
    }

    @Override
    public double calculate(double a, double b) {
        // Вызываем метод calculate из суперкласса Calculator и сохраняем результат.
        result = super.calculate(a, b);
        return result;
    }

    @Override
    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public double getResult() {
        return result;
    }
}