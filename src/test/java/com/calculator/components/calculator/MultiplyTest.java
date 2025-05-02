package com.calculator.components.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.calculator.components.Calculator;

public class MultiplyTest {
private Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testPerkalianBilanganPositif() {
        // (1) setup data
        int AngkaPertama = 100;
        int AngkaKedua = 100;
        
        // (2) panggil method yang akan di test
        double result = calc.multiply((double)AngkaPertama, (double)AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        int expected = 10000;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testPerkalianBilanganNegatif() {
        // (1) setup data
        int AngkaPertama = -50;
        int AngkaKedua = -100;
        
        // (2) panggil method yang akan di test
        double result = calc.multiply((double)AngkaPertama, (double)AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        int expected = 5000;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testPerkalianBilanganPositifNegatif() {
        // (1) setup data
        int AngkaPertama = 100;
        int AngkaKedua = -5;
        
        // (2) panggil method yang akan di test
        double result = calc.multiply((double)AngkaPertama, (double)AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        int expected = -500;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testPerkalianBilanganPositifNol() {
        // (1) setup data
        int AngkaPertama = 100;
        int AngkaKedua = 0;
        
        // (2) panggil method yang akan di test
        double result = calc.multiply((double)AngkaPertama, (double)AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        int expected = 0;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testPerkalianBilanganNol() {
        // (1) setup data
        int AngkaPertama = 0;
        int AngkaKedua = 0;
        
        // (2) panggil method yang akan di test
        double result = calc.multiply((double)AngkaPertama, (double)AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        int expected = 0;
        assertEquals(expected, result, 0.01);
    }
}
