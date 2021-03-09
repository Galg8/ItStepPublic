package Task2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    static {
        scanner.useLocale(Locale.US);
    }

    public static void main(String[] args) throws NegativeNumberException {

        Main.readInteger();

    }

    public static double readInteger() throws NegativeNumberException, GreaterNumberException {
        System.out.println("Napiš číslo:");
        double integer;
        try {
            String txtDouble = scanner.nextLine();
            integer = Double.parseDouble(txtDouble);
        }
        catch (NumberFormatException nfe) {
            throw new NumberFormatException();
        }
        if (integer < 0) {
            throw new NegativeNumberException(integer);
        }

        if (integer > 100) {
            throw new GreaterNumberException(100, integer);
        }
        return integer;
    }
}
