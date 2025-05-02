package com.calculator.components.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.calculator.components.Validator;

public class IsNotDividedByZeroTest {
    private Validator validator;

    @Before
    public void setUp() throws Exception {
        validator = new Validator();
    }

    @Test
    public void testPembagiNol() {
        // (1) setup data
        double input = 0;

        // (2) panggil method yang akan di test
        boolean result = validator.isNotDividedByZero(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(false, result);
    }

    @Test
    public void testPembagiBukanNol() {
        // (1) setup data
        double input = 10;

        // (2) panggil method yang akan di test
        boolean result = validator.isNotDividedByZero(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testEdgeMinusOne() {
        // (1) setup data
        double input = -1;

        // (2) panggil method yang akan di test
        boolean result = validator.isNotDividedByZero(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testEdgePlusOne() {
        // (1) setup data
        double input = 1;

        // (2) panggil method yang akan di test
        boolean result = validator.isNotDividedByZero(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testDesimalPositif() {
        // (1) setup data
        double input = 1.23;

        // (2) panggil method yang akan di test
        boolean result = validator.isNotDividedByZero(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }

    @Test
    public void testDesimalNegatif() {
        // (1) setup data
        double input = -1.23;

        // (2) panggil method yang akan di test
        boolean result = validator.isNotDividedByZero(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(true, result);
    }
}
