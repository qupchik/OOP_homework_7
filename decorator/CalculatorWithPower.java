package decorator;

import operations.Operation;
import operations.OperationFactory;

// CalculatorWithPower реализует интерфейс CalculatorDecorator.
public class CalculatorWithPower implements CalculatorDecorator {
    private final CalculatorDecorator calculator;

    public CalculatorWithPower(CalculatorDecorator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double calculate(double a, double b) {
        Operation powerOperation = OperationFactory.createOperation("power");
        return calculator.calculate(powerOperation.perform(a, b), 0);
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