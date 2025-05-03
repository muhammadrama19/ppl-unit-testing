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
    public void testStringValidDapatDiKonversiKeDouble() {
        // (1) setup data
        String input = "12.5";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(12.5, (Double) result, 0.001);
    }

    @Test
    public void testStringTidakValidUntukDiKonversiKeDouble() {
        // (1) setup data
        String input = "garamararam";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals("string", result);
    }

    @Test
    public void testBilanganBulatDalamString() {
        // (1) setup data
        String input = "10";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(10.0, (Double) result, 0.001);
    }

    @Test
    public void testKombinasiBilanganBulatDanString() {
        // (1) setup data
        String input = "a1a";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals("string", result);
    }

    @Test
    public void testBilanganBulatPositif() {
        // (1) setup data
        String input = "1";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(1.0, (Double) result, 0.001);
    }

    @Test
    public void testBilanganBulatNegatif() {
        // (1) setup data
        String input = "-1";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(-1.0, (Double) result, 0.001);
    }

    @Test
    public void testBilanganNol() {
        // (1) setup data
        String input = "0";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(0.0, (Double) result, 0.001);
    }

    @Test
    public void testBilanganDesimalPositif() {
        // (1) setup data
        String input = "1.5";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(1.5, (Double) result, 0.001);
    }

    @Test
    public void testBilanganDesimalNol() {
        // (1) setup data
        String input = "0.23";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(0.23, (Double) result, 0.001);
    }

    @Test
    public void testBilanganDesimalNegatif() {
        // (1) setup data
        String input = "-1.5";

        // (2) panggil method yang akan di test
        Object result = helper.stringToDouble(input);

        // (3) bandingkan hasilnya dengan yang diharapkan
        assertEquals(-1.5, (Double) result, 0.001);
    }
}
