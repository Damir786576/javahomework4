package calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    private final CalculatorInterface CalculatorService;

    public Calculator(CalculatorInterface CalculatorService) {
        this.CalculatorService = CalculatorService;
    }

    // guest welcome to my site
    @GetMapping
    public String firstCalculator() {
        return CalculatorService.firstCalculator();
    }

    // guest writing two numbers, the program plus them
    @GetMapping(path = "/plus")
    public int plusCalculator(
            @RequestParam(name = "num1", required = false) Integer plusNum1,
            @RequestParam(name = "num2", required = false) Integer plusNum2) {
        if (plusNum1 == null || plusNum2 == null) {
            throw new IllegalArgumentException("Ошибка: оба параметра num1 и num2 должны быть предоставлены.");
        }
        return CalculatorService.plusCalculator(plusNum1, plusNum2);
        }

    // guest writing two numbers, the program minus them
    @GetMapping(path = "/minus")
    public int minusCalculator(
            @RequestParam(name = "num1", required = false) Integer minusNum1,
            @RequestParam(name = "num2", required = false) Integer minusNum2) {
        if (minusNum1 == null || minusNum2 == null) {
            throw new IllegalArgumentException("Ошибка: оба параметра num1 и num2 должны быть предоставлены.");
        }
        return CalculatorService.plusCalculator(minusNum1, minusNum2);
    }

    // guest writing two numbers, the program multiply them
    @GetMapping(path = "/multiply")
    public int multiplyCalculator(
            @RequestParam(name = "num1", required = false) Integer multiplyNum1,
            @RequestParam(name = "num2", required = false) Integer multiplyNum2) {
        if (multiplyNum1 == null || multiplyNum2 == null) {
            throw new IllegalArgumentException("Ошибка: оба параметра num1 и num2 должны быть предоставлены.");
        }
        return CalculatorService.plusCalculator(multiplyNum1, multiplyNum2);
    }

    // guest writing two numbers, the program divide them
    @GetMapping(path = "/divide")
    public int divideCalculator(
            @RequestParam(name = "num1", required = false) Integer divideNum1,
            @RequestParam(name = "num2", required = false) Integer divideNum2) {
        if (divideNum1 == null || divideNum2 == null) {
            throw new IllegalArgumentException("Ошибка: оба параметра num1 и num2 должны быть предоставлены.");
        }
        return CalculatorService.plusCalculator(divideNum1, divideNum2);
    }
}
