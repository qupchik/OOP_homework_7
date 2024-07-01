package operations;

public class PowerOperation implements Operation {
    @Override
    public double perform(double a, double b) {
        return Math.pow(a, b);
    }
}
