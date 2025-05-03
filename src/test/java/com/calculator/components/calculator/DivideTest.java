package com.calculator.components.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.calculator.components.Calculator;

public class DivideTest {

    private Calculator calc;

    @BeforeEach
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void PembagianBerhasilPembagiBukanNol(){
        // (1) setup data
        double AngkaPertama = 3;
        double AngkaKedua = 2;

        // (2) panggil method yang akan di test
        double result = calc.divide(AngkaPertama, AngkaKedua);

        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = 1.5;
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void PembagianGagalPembagiNol() {
        // (1) setup data
        double AngkaPertama = 4;
        double AngkaKedua = 0;

        // (2) panggil method yang akan di test dan tangkap exception
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calc.divide(AngkaPertama, AngkaKedua);
        });

        // (3) bandingkan hasilnya dengan yang diharapkan
        String expectedMessage = "Cannot divide by zero";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void PembagianBerhasilBilanganPositifDanNegatif(){
        // (1) setup data
        double AngkaPertama = 4;
        double AngkaKedua = -1;

        // (2) panggil method yang akan di test
        double result = calc.divide(AngkaPertama, AngkaKedua);

        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = -4;
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void PembagianBerhasilNolDanBilanganPositif(){
        // (1) setup data
        double AngkaPertama = 0;
        double AngkaKedua = 4;

        // (2) panggil method yang akan di test
        double result = calc.divide(AngkaPertama, AngkaKedua);

        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = 0;
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void PembagianBerhasilBilanganNegatifDanPositif(){
        // (1) setup data
        double AngkaPertama = -5;
        double AngkaKedua = 1;

        // (2) panggil method yang akan di test
        double result = calc.divide(AngkaPertama, AngkaKedua);

        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = -5;
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void PembagianBerhasilNegatifdanNegatif(){
        // (1) setup data
        double AngkaPertama = -5;
        double AngkaKedua = -5;

        // (2) panggil method yang akan di test
        double result = calc.divide(AngkaPertama, AngkaKedua);

        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = 1;
        assertEquals(expected, result, 0.001);
    }


}
