package calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {
    private final calculatorInterface calculatorwork;

    public calculator(calculatorInterface calculatorwork) {
        this.calculatorwork = calculatorwork;
    }

    @GetMapping
    public String firstCalculator() {
        return calculatorwork.firstCalculator();
    }

    @GetMapping(path = "/plus")
    public int plusCalculator(@RequestParam("num1") int plusNum1, @RequestParam("num2") int plusNum2) {
        return calculatorwork.plusCalculator(plusNum1, plusNum2);
    }

    @GetMapping(path = "/minus")
    public int minusCalculator(@RequestParam("num1") int minusNum1, @RequestParam("num2") int minusNum2) {
        return calculatorwork.minusCalculator(minusNum1, minusNum2);
    }

    @GetMapping(path = "multiply")
    public int multiplyCalculator(@RequestParam("num1") int multiplyNum1, @RequestParam("num2") int multiplyNum2) {
        return calculatorwork.multiplyCalculator(multiplyNum1, multiplyNum2);
    }

    @GetMapping(path = "divide")
    public String divideCalculator(@RequestParam("num1") int divideNum1, @RequestParam("num2") int divideNum2) {
        return calculatorwork.divideCalculator(divideNum1, divideNum2);
    }
}
