package operations;

public class SquareRootOperation implements Operation {
    @Override
    public double perform(double a, double b) {
        return Math.sqrt(a);
    }
}
