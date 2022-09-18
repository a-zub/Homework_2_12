package pro.sky.homework_2_12.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static pro.sky.homework_2_12.services.Constance.*;



public class CalculatorServiceParamTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSumCorrectly(int a, int b) {
        int result = calculatorService.getAddition(a, b);
       Assertions.assertEquals(a + b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSubtractionCorrectly(int a, int b) {
        int result = calculatorService.getSubtraction(a, b);
        Assertions.assertEquals(a - b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSuMultiplicationCorrectly(int a, int b) {
        int result = calculatorService.getMultiplication(a, b);
        Assertions.assertEquals(a * b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldDivisionCorrectly(int a, int b) {
        double result = calculatorService.getDivision(a, b);
        Assertions.assertEquals((double) a / b, result);
    }


    private static Stream<Arguments> provideCalculatorParams() {
        return Stream.of(Arguments.of(ONE, TWO),
                Arguments.of(TWO, TWO),
                Arguments.of(TWO, THREE),
                Arguments.of(TWO, ZERO)
        );
    }
}
