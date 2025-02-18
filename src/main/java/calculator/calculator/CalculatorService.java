package calculator.calculator;

import org.springframework.stereotype.Service;

// everything that matters
@Service
public class CalculatorService implements CalculatorInterface {
    public String firstCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public int plusCalculator(int plusNum1, int plusNum2) {
        return plusNum1 + plusNum2;
    }

    public int minusCalculator(int minusNum1, int minusNum2) {
        return minusNum1 - minusNum1;
    }

    public int multiplyCalculator(int multiplyNum1, int multiplyNum2) {
        return multiplyNum1 * multiplyNum2;
    }

    public int divideCalculator(int divideNum1, int divideNum2) {
        return divideNum1 / divideNum2;
    }



}