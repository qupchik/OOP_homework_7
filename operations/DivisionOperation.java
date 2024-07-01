package operations;

public class DivisionOperation implements Operation {
    @Override
    public double perform(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
