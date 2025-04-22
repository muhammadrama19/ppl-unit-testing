package com.calculator.components;

public class helper {
    public Object stringToDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return "string";
        }
    }
}
