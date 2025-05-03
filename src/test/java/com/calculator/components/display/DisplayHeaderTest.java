package com.calculator.components.display;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.calculator.components.Display;

public class DisplayHeaderTest {
    private Display display;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUp() throws Exception {
        display = new Display();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(outContent)); // karena System.err juga dipakai
    }

    @Test
    public void testMenampilkanHeaderKalkulator() {
        // (1) Panggil method yang akan diuji
        display.displayHeader();

        // (2) bandingkan hasilnya dengan yang diharapkan
        String expectedOutput = 
                "--------------------------" + System.lineSeparator() +
                "Welcome to the Calculator!" + System.lineSeparator() +
                "This calculator supports basic operations: addition, subtraction, multiplication, and division." + System.lineSeparator() +
                "--------------------------";

        // (3) validasi output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}
