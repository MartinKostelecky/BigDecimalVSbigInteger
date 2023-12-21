package cz.martinkostelecky;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("2.75");
        BigDecimal number2 = new BigDecimal("1.33");
        BigInteger number3 = new BigInteger(String.valueOf(Long.MAX_VALUE));

        System.out.println(bigDecimalAddition(number1, number2));
        System.out.println(bigDecimalSubtraction(number1, number2));
        System.out.println(bigDecimalMultiplication(number1, number2));
        System.out.println(bigDecimalDivision(number1, number2));
        System.out.println(bigInteger(number3));
    }

    public static String bigDecimalAddition(BigDecimal number1, BigDecimal number2) {
        return String.valueOf(number1.add(number2));
    }

    public static String bigDecimalSubtraction(BigDecimal number1, BigDecimal number2) {
        return String.valueOf(number1.subtract(number2));
    }

    public static String bigDecimalMultiplication(BigDecimal number1, BigDecimal number2) {
        return String.valueOf(number1.multiply(number2));
    }

    public static String bigDecimalDivision(BigDecimal number1, BigDecimal number2) {
        //precision to 12 decimal numbers
        return String.valueOf(number1.divide(number2, 12, RoundingMode.HALF_UP));
    }

    public static String bigInteger(BigInteger number3) {
        //test of BigInteger number being bigger than max value of type long
        System.out.println(number3);
        return String.valueOf(number3.add(BigInteger.valueOf(123456789)));
    }
}