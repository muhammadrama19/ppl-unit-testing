package com.calculator;

import com.calculator.components.Display;

public class Main {
    public static void main(String[] args) {
        Display calc = new Display();
        calc.displayHeader();
        calc.input();
    }
}
