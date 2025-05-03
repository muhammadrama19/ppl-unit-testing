package com.calculator.components.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.calculator.components.Validator;

public class IsNumberValidTest {
    private Validator validator;

    @BeforeEach
    public void setUp() throws Exception {
        validator = new Validator();
    }

    @Test
    public void testNumberInValidRange() {
        // (1) setup data
        Object input = 2;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testNumberOutOfRange() {
        // (1) setup data
        Object input = 40000;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(false, result);
    }

    @Test
    public void testInputNotNumber() {
        // (1) setup data
        Object input = "abc";

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(false, result);
    }

    @Test
    public void testEdgeNegativeOutOfRange() {
        // (1) setup data
        Object input = -32769;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(false, result);
    }

    @Test
    public void testEdgeMinValidRange() {
        // (1) setup data
        Object input = -32768;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testEdgeMinPlusOne() {
        // (1) setup data
        Object input = -32767;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testEdgeMaxMinusOne() {
        // (1) setup data
        Object input = 32766;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testEdgeMaxValidRange() {
        // (1) setup data
        Object input = 32767;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testEdgeMaxPlusOne() {
        // (1) setup data
        Object input = 32768;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(false, result);
    }
}