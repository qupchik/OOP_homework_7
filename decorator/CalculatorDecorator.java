package decorator;

// Интерфейс CalculatorDecorator объявляет методы, которые должны быть реализованы
// в классах декораторов калькулятора.
public interface CalculatorDecorator {
    double calculate(double a, double b);

    void setResult(double result);

    double getResult();
}