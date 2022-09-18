package pro.sky.homework_2_12.services;

import org.junit.jupiter.api.Test;
import pro.sky.homework_2_12.exception.DivisionByZeroException;

import static pro.sky.homework_2_12.services.Constance.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    public final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void shouldReturnTwoWhenSumOneAndOne() {
        int result = calculatorService.getAddition((int) ONE, (int) ONE);
        assertEquals(ONE + ONE, result);
    }

    @Test
    public void shouldReturnThreeWhenSumTwoAndOne() {
        int result = calculatorService.getAddition((int) TWO, (int) ONE);
        assertEquals(TWO + ONE, result);
    }

    @Test
    public void shouldReturnOneWhenSubtractTwoAndOne() {
        int result = calculatorService.getAddition(TWO, ONE);
        assertEquals(TWO - ONE, result);
    }

    @Test
    public void shouldReturnZeroSubtractSumOneAndOne() {
        int result = calculatorService.getSubtraction(TWO, ONE);
        assertEquals(ONE - ONE, result);
    }

    @Test
    public void shouldReturnTwoWhenMultiplyOneAndTwo() {
        int result = calculatorService.getMultiplication(TWO, ONE);
        assertEquals(ONE * TWO, result);
    }

    @Test
    public void shouldReturnOneWhenMultiplyOneAndOne() {
        int result = calculatorService.getMultiplication(TWO, ONE);
        assertEquals(ONE * ONE, result);
    }

    @Test
    public void shouldReturnTwoWhenDivisionTwoAndOne() {
        Double result = calculatorService.getDivision(TWO, ONE);
        assertEquals((double) TWO / ONE, result);
    }

    @Test
    public void shouldReturnOneWhenDivisionOneAndOne() {
        Double result = calculatorService.getDivision(TWO, ONE);
        assertEquals((double) ONE / ONE, result);
    }

    @Test
    public void shouldThrowDivisionDuyZeroExceptionWenDivideByZero() {
        assertThrows(DivisionByZeroException.class, ()-> calculatorService.getDivision(ONE, ZERO));
    }

}