package com.calculator.components.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.calculator.components.Calculator;

public class AddTest {
    private Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testPenambahanBilanganPositif() {
        // (1) setup data
        int AngkaPertama = 50;
        int AngkaKedua = 100;
        
        // (2) panggil method yang akan di test
        int result = (int)calc.add((double)AngkaPertama, (double)AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        int expected = 150;
        assertEquals(expected, result);
    }

    @Test
    public void testPenambahanBilanganNegatif() {
        // (1) setup data
        int AngkaPertama = -50;
        int AngkaKedua = -100;
        
        // (2) panggil method yang akan di test
        int result = (int)calc.add((double)AngkaPertama, (double)AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        int expected = -150;
        assertEquals(expected, result);
    }

    @Test
    public void testPenambahanBilanganNol() {
        // (1) setup data
        int AngkaPertama = 0;
        int AngkaKedua = 0;
        
        // (2) panggil method yang akan di test
        int result = (int)calc.add((double)AngkaPertama, (double)AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void testPenambahanBilanganPositifDanNegatif() {
        // (1) setup data
        int AngkaPertama = 100;
        int AngkaKedua = -200;
        
        // (2) panggil method yang akan di test
        int result = (int)calc.add((double)AngkaPertama, (double)AngkaKedua);
        
        // (3) bandingkan hasilnya dengan yang diharapkan
        int expected = -100;
        assertEquals(expected, result);
    }
}
