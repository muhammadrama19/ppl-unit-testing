package com.calculator.components;

import java.util.Scanner;

public class Display {
    private Validator validator = new Validator();
    private Helper helper = new Helper();
    private Calculator calc = new Calculator();

    public void displayHeader() {
        System.err.println("--------------------------");
        System.out.println("Welcome to the Calculator!");
        System.out.println(
                "This calculator supports basic operations: addition, subtraction, multiplication, and division.");
        System.err.println("--------------------------");
    }

    public void displayMenu() {
        System.out.println("Select an operation:");
        System.out.println("Input the operator symbol ( + , - , / , * )");
        System.out.println("( + ) Addition");
        System.out.println("( - ) Subtraction");
        System.out.println("( / ) Multiplication");
        System.out.println("( * ) Division");
    }

    public char getOperator(Scanner scanner) {
        displayMenu();
        System.out.println("Enter the operator: ");
        char operator = scanner.nextLine().charAt(0);
        if (!validator.isValidOperator(operator)) {
            System.out.println("Enter the operator: ");
            return '0';
        }
        return operator;
    }

    public void input(Scanner scanner) {
        System.out.println("Enter the first number: ");
        Object firstInput = helper.stringToDouble(scanner.nextLine());
        if (!validator.isNumberValid(firstInput)) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }

        System.out.println("Enter the second number: ");
        Object secondInput = helper.stringToDouble(scanner.nextLine());
        if (!validator.isNumberValid(secondInput)) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }
        
        double firstNumber = ((Double) firstInput);
        double secondNumber = ((Double) secondInput);
        char operator = getOperator(scanner);
        
        if (operator == '/' && !validator.isNotDividedByZero((secondNumber))) {
            System.out.println("Cannot divide by zero. Please enter a valid number.");
            return;
        }
        scanner.close();
        
        double result = calc.calculate(firstNumber, secondNumber, (char) operator);
        System.out.println("Result: " + result);

    }
}
