package com.calculator.components.display;


import java.io.ByteArrayInputStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.calculator.components.Display;

public class GetOperatorTest {
    private Display display;

    @BeforeEach
    public void setUp() throws Exception {
        display = new Display();
    }

    @Test
    public void testOperatorTidakValid() {
        // (1) setup data
        String input = "A\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // (2) panggil method yang akan di test
        Scanner scanner = new Scanner(System.in);
        char result = display.getOperator(scanner);

        // (3) bandingkan hasilnya dengan yang diharapkan
        char expected = '0';
        assertEquals(expected, result);
    }

    @Test
    public void testOperatorTambah() {
        // (1) setup data
        String input = "+\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // (2) panggil method yang akan di test
        Scanner scanner = new Scanner(System.in);
        char result = display.getOperator(scanner);

        // (3) bandingkan hasilnya dengan yang diharapkan
        char expected = '+';
        assertEquals(expected, result);
    }

    @Test
    public void testOperatorKurang() {
        // (1) setup data
        String input = "-\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // (2) panggil method yang akan di test
        Scanner scanner = new Scanner(System.in);
        char result = display.getOperator(scanner);

        // (3) bandingkan hasilnya dengan yang diharapkan
        char expected = '-';
        assertEquals(expected, result);
    }

    @Test
    public void testOperatorKali() {
        // (1) setup data
        String input = "*\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // (2) panggil method yang akan di test
        Scanner scanner = new Scanner(System.in);
        char result = display.getOperator(scanner);

        // (3) bandingkan hasilnya dengan yang diharapkan
        char expected = '*';
        assertEquals(expected, result);
    }

    @Test
    public void testOperatorBagi() {
        // (1) setup data
        String input = "/\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // (2) panggil method yang akan di test
        Scanner scanner = new Scanner(System.in);
        char result = display.getOperator(scanner);

        // (3) bandingkan hasilnya dengan yang diharapkan
        char expected = '/';
        assertEquals(expected, result);
    }

}
