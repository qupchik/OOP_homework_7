package operations;

public class OperationFactory {
    public static Operation createOperation(String type) {
        switch (type) {
            case "1":
            case "addition":
                return new AdditionOperation();
            case "2":
            case "subtraction":
                return new SubtractionOperation();
            case "3":
            case "multiplication":
                return new MultiplicationOperation();
            case "4":
            case "division":
                return new DivisionOperation();
            case "5":
            case "power":
                return new PowerOperation();
            case "6":
            case "sqrt":
                return new SquareRootOperation();
            default:
                return null;
        }
    }
}
