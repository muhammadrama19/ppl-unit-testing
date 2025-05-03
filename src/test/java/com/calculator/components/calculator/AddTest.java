package com.calculator.components.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.calculator.components.Calculator;

public class AddTest {
    private Calculator calc;

    @BeforeEach
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testPenambahanBilanganPositif() {
        // (1) setup data
        double AngkaPertama = 50;
        double AngkaKedua = 100;

        // (2) panggil method yang akan di test
        double result = calc.add(AngkaPertama, AngkaKedua);

        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = 150;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testPenambahanBilanganNegatif() {
        // (1) setup data
        double AngkaPertama = -50;
        double AngkaKedua = -100;

        // (2) panggil method yang akan di test
        double result = calc.add(AngkaPertama, AngkaKedua);

        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = -150;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testPenambahanBilanganNol() {
        // (1) setup data
        double AngkaPertama = 0;
        double AngkaKedua = 0;

        // (2) panggil method yang akan di test
        double result = calc.add(AngkaPertama, AngkaKedua);

        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = 0;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testPenambahanBilanganPositifDanNegatif() {
        // (1) setup data
        double AngkaPertama = 100;
        double AngkaKedua = -200;

        // (2) panggil method yang akan di test
        double result = calc.add(AngkaPertama, AngkaKedua);

        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = -100;
        assertEquals(expected, result, 0.01);
    }
}
