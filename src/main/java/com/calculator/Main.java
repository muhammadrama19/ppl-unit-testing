package com.calculator;

import com.calculator.components.display;

public class main {
    public static void main(String[] args) {
        display calc = new display();
        calc.displayHeader();
        calc.input();
    }
}
