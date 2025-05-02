package com.calculator.components.display;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.calculator.components.Display;

public class InputTest {
    private Display display;

    @Before
    public void setUp() throws Exception {
        display = new Display();
    }

    @Test
    public void testInputKarakterPadaAngkaPertama() {
        // (1) setup data
        String input = "A\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // redirect output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // (2) panggil method yang akan di test
        Scanner scanner = new Scanner(System.in);
        display.input(scanner);

        // (3) bandingkan hasilnya dengan yang diharapkan
        String expectedOutput = "Enter the first number: " + System.lineSeparator() +
                "Invalid input. Please enter a valid number.";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testInputAngkaPertamaDibawahRange() {
        // (1) Setup input
        String input = "-32769\n"; // Tambahkan input dummy untuk operator
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // (2) Panggil method yang akan diuji
        Scanner scanner = new Scanner(System.in);
        display.input(scanner);

        // (3) Bandingkan hasilnya dengan yang diharapkan
        String expectedOutput = "Enter the first number: " + System.lineSeparator() +
                "Invalid input. Please enter a valid number.";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testInputAngkaPertamaDiatasRange() {
        // (1) Setup input
        String input = "32768\n0\n"; // Tambahkan input dummy untuk operator
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // (2) Panggil method yang akan diuji
        Scanner scanner = new Scanner(System.in);
        display.input(scanner);

        // (3) Bandingkan hasilnya dengan yang diharapkan
        String expectedOutput = "Enter the first number: " + System.lineSeparator() +
                "Invalid input. Please enter a valid number.";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testInputKarakterPadaInputKedua() {
        // (1) Setup input
        String input = "1\nA\n"; // Tambahkan input dummy untuk operator
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // (2) Panggil method yang akan diuji
        Scanner scanner = new Scanner(System.in);
        display.input(scanner);

        // (3) Bandingkan hasilnya dengan yang diharapkan
        String expectedOutput = "Enter the first number: " + System.lineSeparator() + "Enter the second number: "
                + System.lineSeparator() +
                "Invalid input. Please enter a valid number.";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testInputAngkaKeduaDibawahRange() {
        // (1) Setup input
        String input = "1\n-32769\n"; // Tambahkan input dummy untuk operator
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // (2) Panggil method yang akan diuji
        Scanner scanner = new Scanner(System.in);
        display.input(scanner);

        // (3) Bandingkan hasilnya dengan yang diharapkan
        String expectedOutput = "Enter the first number: " + System.lineSeparator() + "Enter the second number: "
                + System.lineSeparator() +
                "Invalid input. Please enter a valid number.";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testInputAngkaKeduaDiatasRange() {
        // (1) Setup input
        String input = "1\n32768\n"; // Tambahkan input dummy untuk operator
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // (2) Panggil method yang akan diuji
        Scanner scanner = new Scanner(System.in);
        display.input(scanner);

        // (3) Bandingkan hasilnya dengan yang diharapkan
        String expectedOutput = "Enter the first number: " + System.lineSeparator() + "Enter the second number: "
                + System.lineSeparator() +
                "Invalid input. Please enter a valid number.";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testMengujiPembagianDenganNol() {
        // (1) Setup input
        String input = "1\n0\n/\n"; // Tambahkan input dummy untuk operator
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // (2) Panggil method yang akan diuji
        Scanner scanner = new Scanner(System.in);
        display.input(scanner);

        // (3) Bandingkan hasilnya dengan yang diharapkan
        String expectedOutput = "Enter the first number: " + System.lineSeparator() + "Enter the second number: "
                + System.lineSeparator() +
                "Select an operation:" + System.lineSeparator() +
                "Input the operator symbol ( + , - , / , * )" + System.lineSeparator() +
                "( + ) Addition" + System.lineSeparator() +
                "( - ) Subtraction" + System.lineSeparator() +
                "( * ) Multiplication" + System.lineSeparator() +
                "( / ) Division" + System.lineSeparator() +
                "Enter the operator: " + System.lineSeparator() +
                "Cannot divide by zero. Please enter a valid number.";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testMengujiValidBatasAtas(){
        // (1) Setup input
        String input = "32767\n32767\n+\n"; // Tambahkan input dummy untuk operator
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // (2) Panggil method yang akan diuji
        Scanner scanner = new Scanner(System.in);
        display.input(scanner);

        // (3) Bandingkan hasilnya dengan yang diharapkan
        String expectedOutput = "Enter the first number: " + System.lineSeparator() + "Enter the second number: "
                + System.lineSeparator() +
                "Select an operation:" + System.lineSeparator() +
                "Input the operator symbol ( + , - , / , * )" + System.lineSeparator() +
                "( + ) Addition" + System.lineSeparator() +
                "( - ) Subtraction" + System.lineSeparator() +
                "( * ) Multiplication" + System.lineSeparator() +
                "( / ) Division" + System.lineSeparator() +
                "Enter the operator: " + System.lineSeparator() +
                "Result: " + 65534.0;
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testMengujiValidBatasBawah(){
        // (1) Setup input
        String input = "-32768\n-32768\n+\n"; // Tambahkan input dummy untuk operator
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // (2) Panggil method yang akan diuji
        Scanner scanner = new Scanner(System.in);
        display.input(scanner);

        // (3) Bandingkan hasilnya dengan yang diharapkan
        String expectedOutput = "Enter the first number: " + System.lineSeparator() + "Enter the second number: "
                + System.lineSeparator() +
                "Select an operation:" + System.lineSeparator() +
                "Input the operator symbol ( + , - , / , * )" + System.lineSeparator() +
                "( + ) Addition" + System.lineSeparator() +
                "( - ) Subtraction" + System.lineSeparator() +
                "( * ) Multiplication" + System.lineSeparator() +
                "( / ) Division" + System.lineSeparator() +
                "Enter the operator: " + System.lineSeparator() +
                "Result: " + -65536.0;
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
