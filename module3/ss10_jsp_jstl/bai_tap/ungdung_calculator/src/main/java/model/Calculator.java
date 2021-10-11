package model;

public class Calculator {
    public static double calculate(double firstNumber, double secondNumber, char operator) throws ArithmeticException, UnsupportedOperationException {
        switch (operator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                if (secondNumber > 0 || secondNumber < 0) {
                    return firstNumber / secondNumber;
                } else {
                    throw new ArithmeticException("Cannot be divided by 0");
                }
            default:
                throw new UnsupportedOperationException("Invalid calculation");
        }
    }
}
