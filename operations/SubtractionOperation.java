package operations;

public class SubtractionOperation implements Operation {
    @Override
    public double perform(double a, double b) {
        return a - b;
    }
}
