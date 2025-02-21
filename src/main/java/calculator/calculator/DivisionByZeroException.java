package calculator.calculator;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException() {
        super("Ошибка: деление на 0 запрещено!");
    }
}