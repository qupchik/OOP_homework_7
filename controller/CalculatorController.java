package controller;

import java.util.Scanner;

import decorator.*;
import operations.Operation;
import operations.OperationFactory;
import utils.Logger;
import view.CalculatorView;

public class CalculatorController {
    private final CalculatorView view;
    private CalculatorDecorator calculator;

    public CalculatorController(CalculatorView view) {
        this.view = view;
    }

    public void start() {
        Logger logger = Logger.getInstance();
        Operation addition = OperationFactory.createOperation("addition");
        calculator = new CalculatorWithSquareRoot(
                new CalculatorWithPower(
                        new CalculatorWithHistory(
                                new CalculatorWithUserInput(
                                        new BasicCalculator(addition)))));

        boolean running = true;
        double lastResult = 0;
        double firstNumber, secondNumber;

        while (running) {
            if (view.useLastResult()) {
                firstNumber = lastResult;
                System.out.print("Enter second number: ");
                secondNumber = view.getSecondNumber();
            } else {
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();
            }

            String operationChoice = view.getOperation();
            Operation operation = OperationFactory.createOperation(operationChoice);
            if (operation != null) {
                calculator = new BasicCalculator(operation);
                double result = calculator.calculate(firstNumber, secondNumber);
                view.displayResult(result);
                lastResult = result;
            } else {
                logger.log("Invalid operation choice");
            }

            System.out.print("Do you want to continue? (y/n) ");
            String choice = new Scanner(System.in).nextLine();
            running = choice.equalsIgnoreCase("y");
        }
    }
}