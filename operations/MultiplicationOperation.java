package operations;

public class MultiplicationOperation implements Operation {
    @Override
    public double perform(double a, double b) {
        return a * b;
    }
}