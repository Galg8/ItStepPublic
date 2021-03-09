package Task2;

public class NegativeNumberException extends RuntimeException {

    public NegativeNumberException(double actualValue) {
        super(String.format("Number is %f, which is not allowed", actualValue));
    }
}
