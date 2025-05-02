package com.calculator;

import java.util.Scanner;

import com.calculator.components.Display;

public class Main {
    public static void main(String[] args) {
        Display calc = new Display();
        Scanner scanner = new Scanner(System.in);

        calc.displayHeader();
        calc.input(scanner);
    }
}
