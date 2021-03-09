package Task2;

public class GreaterNumberException extends RuntimeException{
    public GreaterNumberException(double maxValue, double actualValue) {
        super(String.format("Exceed number value max is %d, but current is %d", maxValue, actualValue));
    }
}
