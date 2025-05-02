package com.calculator.components;

public class Calculator {
    private Validator validator = new Validator();

    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        if (validator.isNotDividedByZero(secondNumber)) {
            return firstNumber / secondNumber;
        } else {
            throw new ArithmeticException("Cannot divide by zero");

        }
    }

    public double calculate(double firstNumber, double secondNumber, Character operator) {
        switch (operator) {
            case '+':
                return add(firstNumber, secondNumber);
            case '-':
                return subtract(firstNumber, secondNumber);
            case '*':
                return multiply(firstNumber, secondNumber);
            case '/':
                return divide(firstNumber, secondNumber);
            default:
                throw new IllegalArgumentException("Invalid operator. Please enter a valid operator.");
        }
    }
}