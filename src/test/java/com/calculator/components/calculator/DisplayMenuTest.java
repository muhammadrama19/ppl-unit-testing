package com.calculator.components.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.calculator.components.Display;

public class DisplayMenuTest {

    private Display display;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUp() {
        display = new Display();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(outContent)); 
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut); 
        System.setErr(originalErr); 
    }

    @Test
    public void menuBerhasilDitampilkan() {
        // (1) Call method yang akan diuji
        display.displayMenu();

        // (2) Expected output 
        String expectedOutput = String.join(System.lineSeparator(),
                "Select an operation:",
                "Input the operator symbol ( + , - , / , * )",
                "( + ) Addition",
                "( - ) Subtraction",
                "( * ) Multiplication",
                "( / ) Division");

        // (3) Bandingkan hasilnya dengan yang diharapkan
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}
