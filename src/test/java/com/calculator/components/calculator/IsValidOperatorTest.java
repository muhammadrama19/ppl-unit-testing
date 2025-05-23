package com.calculator.components.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.calculator.components.Validator;

public class IsValidOperatorTest {

    private Validator val;

    @BeforeEach
    public void setUp() throws Exception {
        val = new Validator();
    }

    @Test
    public void operatorValidAdd(){
        // (1) setup data 
        char operator = '+';

        // (2) panggil method yang akan di test
        boolean result = val.isValidOperator(operator);

        // (3) bandingkan hasilnya dengan yang diharapkan
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    public void operatorValidSubtract(){
        // (1) setup data 
        char operator = '-';

        // (2) panggil method yang akan di test
        boolean result = val.isValidOperator(operator);

        // (3) bandingkan hasilnya dengan yang diharapkan
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    public void operatorValidMultiply(){
        // (1) setup data 
        char operator = '*';

        // (2) panggil method yang akan di test
        boolean result = val.isValidOperator(operator);

        // (3) bandingkan hasilnya dengan yang diharapkan
        boolean expected = true;
        assertEquals(expected, result);
    }


    @Test
    public void operatorValidDivide(){
        // (1) setup data 
        char operator = '/';

        // (2) panggil method yang akan di test
        boolean result = val.isValidOperator(operator);

        // (3) bandingkan hasilnya dengan yang diharapkan
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    public void operatorInvalid(){
        // (1) setup data
        char operator = '%';

        // (2) panggil method yang akan di test
        boolean result = val.isValidOperator(operator);



        // (3) bandingkan hasilnya dengan yang diharapkan
        boolean expected = false;
        assertEquals(expected, result);

    }


}
