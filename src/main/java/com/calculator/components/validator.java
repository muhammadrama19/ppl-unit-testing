package com.calculator.components;

public class validator {
    public boolean isNumberValid(Object parameter) {
        if (parameter instanceof Number) {
            double number = ((Number) parameter).doubleValue();
            return number >= -32_768 && number <= 32_767;
        }
        return false;
    }

    public boolean isNotDividedByZero(double num) {
        if (num == 0) {
            return false;
        }
        return true;
    }

    public boolean isValidOperator(char option) {
        if (option == '+' || option == '-' || option == '/' || option == '*') {
            return true;
        } else {
            System.out.println("Invalid operator. Please enter a valid operator.");
            return false;
        }
    }
}
