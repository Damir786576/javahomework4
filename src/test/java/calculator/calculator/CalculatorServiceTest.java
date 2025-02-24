package calculator.calculator;

import calculator.calculator.exception.DivisionByZeroException;
import calculator.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorService();


    @Test
    void testAdd() {
        assertEquals("10 + 10 = 20", calculatorService.plusCalculator(10, 10));
        assertEquals("20 + 20 = 40", calculatorService.plusCalculator(20, 20));
    }

    @Test
    void testMinus() {
        assertEquals("10 - 10 = 0", calculatorService.minusCalculator(10, 10));
        assertEquals("20 - 20 = 0", calculatorService.minusCalculator(20, 20));
    }

    @Test
    void testMultiply() {
        assertEquals("10 * 10 = 100", calculatorService.multiplyCalculator(10, 10));
        assertEquals("20 * 20 = 400", calculatorService.multiplyCalculator(20, 20));
    }

    @Test
    void testDivide() {
        assertEquals("10 / 10 = 1", calculatorService.divideCalculator(10, 10));
        assertEquals("20 / 20 = 1", calculatorService.divideCalculator(20, 20));
    }

    @Test
    void testDivizionByZero() {
        Exception exception = assertThrows(DivisionByZeroException.class, () -> calculatorService.divideCalculator(5, 0));
        assertEquals("Ошибка: деление на 0 запрещено!", exception.getMessage());
    }
}
