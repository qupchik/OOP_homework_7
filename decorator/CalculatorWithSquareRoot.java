package decorator;

import operations.Operation;
import operations.OperationFactory;

// CalculatorWithSquareRoot реализует интерфейс CalculatorDecorator.
public class CalculatorWithSquareRoot implements CalculatorDecorator {
    private final CalculatorDecorator calculator;

    public CalculatorWithSquareRoot(CalculatorDecorator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double calculate(double a, double b) {
        Operation sqrtOperation = OperationFactory.createOperation("sqrt");
        return calculator.calculate(sqrtOperation.perform(a, b), 0);
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
