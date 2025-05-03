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
    public void testNumberDalamRangeValid() {
        // (1) setup data
        Object input = 2;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testNumberDiLuarRangeValid() {
        // (1) setup data
        Object input = 40000;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(false, result);
    }

    @Test
    public void testInputBukanNumber() {
        // (1) setup data
        Object input = "abc";

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(false, result);
    }

    @Test
    public void testEdgeRangeValidMinimumKurang1() {
        // (1) setup data
        Object input = -32769;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(false, result);
    }

    @Test
    public void testEdgeRangeValidMinimum() {
        // (1) setup data
        Object input = -32768;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testEdgeRangeValidMinimumTambah1() {
        // (1) setup data
        Object input = -32767;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testEdgeRangeValidMaksimumKurang1() {
        // (1) setup data
        Object input = 32766;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testEdgeRangeValidMaksimum() {
        // (1) setup data
        Object input = 32767;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testEdgeRangeValidMaksimumTambah1() {
        // (1) setup data
        Object input = 32768;

        // (2) panggil method yang akan di test
        boolean result = validator.isNumberValid(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(false, result);
    }
}