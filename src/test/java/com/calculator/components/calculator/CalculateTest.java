package com.calculator.components.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.calculator.components.Calculator;

public class CalculateTest {

    private Calculator calc;

    @BeforeEach
    public void setUp() throws Exception{
        calc = new Calculator();
    }

    @Test
    public void operasiPenambahanBerhasilTerpanggil(){
    
        // (1) setup data
        double AngkaPertama = 5;
        double AngkaKedua = 5;
        Character operator = '+';

        //(2) Panggil method yang akan di test
        double result = calc.calculate(AngkaPertama, AngkaKedua, operator);

        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = 10;
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void operasiPenguranganBerhasilTerpanggil(){
    
        // (1) setup data
        double AngkaPertama = 10;
        double AngkaKedua = 5;
        Character operator = '-';

        //(2) Panggil method yang akan di test
        double result = calc.calculate(AngkaPertama, AngkaKedua, operator);

        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = 5;
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void operasiPerkalianBerhasilTerpanggil(){
        // (1) setup data
        double AngkaPertama = 25;
        double AngkaKedua = 2;
        Character operator = '*';

        // (2) Panggil method yang akan di test
        double result = calc.calculate(AngkaPertama, AngkaKedua, operator);

        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = 50;
        assertEquals(expected, result, 0.001);

    }

    @Test
    public void operasiPembagianBerhasilTerpanggil(){
        // (1) setup data
        double AngkaPertama = 20;
        double AngkaKedua = 10;
        Character operator = '/';

        // (2) Panggil method yang akan di test
        double result = calc.calculate(AngkaPertama, AngkaKedua, operator);

        // (3) bandingkan hasilnya dengan yang diharapkan
        double expected = 2;
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void operasiGagalOperatorTidakValid(){
        // (1) setup dat
        double AngkaPertama = 10;
        double AngkaKedua = 5;
        Character operator = '?';
        
        // (2) panggil method yang akan di test dan tangkap exception
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.calculate(AngkaPertama, AngkaKedua, operator);
        });

        // (3) bandingkan hasilnya dengan yang diharapkan
        String expectedMessage = "Invalid operator. Please enter a valid operator.";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);


    }




}
