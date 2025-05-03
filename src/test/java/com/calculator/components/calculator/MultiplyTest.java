package com.calculator.components.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.calculator.components.Calculator;

public class MultiplyTest {
private Calculator calc;

    @BeforeEach
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testPerkalianBilanganPositif() {
        // (1) setup data
        double AngkaPertama = 100;
        double AngkaKedua = 100;
        
        // (2) panggil method yang akan di test
        double result = calc.multiply(AngkaPertama, AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = 10000;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testPerkalianBilanganNegatif() {
        // (1) setup data
        double AngkaPertama = -50;
        double AngkaKedua = -100;
        
        // (2) panggil method yang akan di test
        double result = calc.multiply(AngkaPertama, AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = 5000;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testPerkalianBilanganPositifNegatif() {
        // (1) setup data
        double AngkaPertama = 100;
        double AngkaKedua = -5;
        
        // (2) panggil method yang akan di test
        double result = calc.multiply(AngkaPertama, AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = -500;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testPerkalianBilanganPositifNol() {
        // (1) setup data
        double AngkaPertama = 100;
        double AngkaKedua = 0;
        
        // (2) panggil method yang akan di test
        double result = calc.multiply(AngkaPertama, AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = 0;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testPerkalianBilanganNol() {
        // (1) setup data
        double AngkaPertama = 0;
        double AngkaKedua = 0;
        
        // (2) panggil method yang akan di test
        double result = calc.multiply(AngkaPertama, AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = 0;
        assertEquals(expected, result, 0.01);
    }
}
