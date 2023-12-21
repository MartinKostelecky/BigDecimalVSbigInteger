package cz.martinkostelecky;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void bigDecimalAddition() {
        //given
        BigDecimal number1 = new BigDecimal("2.75");
        BigDecimal number2 = new BigDecimal("1.33");

        //when
        String result = Main.bigDecimalAddition(number1, number2);
        //then
        assertEquals("4.08",result);
    }

    @Test
    void bigDecimalSubtraction() {
        //given
        BigDecimal number1 = new BigDecimal("2.75");
        BigDecimal number2 = new BigDecimal("1.33");

        //when
        String result = Main.bigDecimalSubtraction(number1, number2);
        //then
        assertEquals("1.42",result);
    }

    @Test
    void bigDecimalMultiplication() {
        //given
        BigDecimal number1 = new BigDecimal("2.75");
        BigDecimal number2 = new BigDecimal("1.33");

        //when
        String result = Main.bigDecimalMultiplication(number1, number2);
        //then
        assertEquals("3.6575",result);
    }

    @Test
    void bigDecimalDivision() {
        //given
        BigDecimal number1 = new BigDecimal("2.75");
        BigDecimal number2 = new BigDecimal("1.33");

        //when
        String result = Main.bigDecimalDivision(number1, number2);
        //then
        assertEquals("2.067669172932",result);
    }
}