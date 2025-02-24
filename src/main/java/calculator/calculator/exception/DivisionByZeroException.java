package calculator.calculator.exception;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String s) {
        super("Ошибка: деление на 0 запрещено!");
    }
}
