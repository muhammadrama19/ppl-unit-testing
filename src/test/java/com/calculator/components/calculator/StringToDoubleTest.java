package com.calculator.components.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.calculator.components.Helper;

public class StringToDoubleTest {
    private Helper helper;

    @BeforeEach
    public void setUp() throws Exception {
        helper = new Helper();
    }

    @Test
    public void testStringValidDecimal() {
        // (1) setup data
        String input = "12.5";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(12.5, (Double) result, 0.001);
    }

    @Test
    public void testStringInvalidCharacters() {
        // (1) setup data
        String input = "garamararam";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals("string", result);
    }

    @Test
    public void testStringValidInteger() {
        // (1) setup data
        String input = "10";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(10.0, (Double) result, 0.001);
    }

    @Test
    public void testStringMixedCharacters() {
        // (1) setup data
        String input = "a1a";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals("string", result);
    }

    @Test
    public void testPositiveInteger() {
        // (1) setup data
        String input = "1";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(1.0, (Double) result, 0.001);
    }

    @Test
    public void testNegativeInteger() {
        // (1) setup data
        String input = "-1";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(-1.0, (Double) result, 0.001);
    }

    @Test
    public void testZero() {
        // (1) setup data
        String input = "0";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(0.0, (Double) result, 0.001);
    }

    @Test
    public void testPositiveDecimal() {
        // (1) setup data
        String input = "1.5";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(1.5, (Double) result, 0.001);
    }

    @Test
    public void testZeroDecimal() {
        // (1) setup data
        String input = "0.23";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(0.23, (Double) result, 0.001);
    }

    @Test
    public void testNegativeDecimal() {
        // (1) setup data
        String input = "-1.5";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(-1.5, (Double) result, 0.001);
    }
}
