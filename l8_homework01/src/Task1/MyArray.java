package Task1;

import java.util.Random;

public class MyArray {
    Random random = new Random();
    private int convertedInput;
    private int[] array = new int[random.nextInt(10)];

    public MyArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((10 - (-10) + 1)) - 10;

        }
        array[array.length - 1] = 0;
    }

    public void division(String input) {
        try {
            convertedInput = Integer.parseInt(input);

            for (int i = 0; i < array.length; i++) {
                System.out.println("Celočíselný výsledek: " + (convertedInput / array[i]) + "\tZbytek: " + (convertedInput % array[i]));
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Nezadal si celočíselnou hodnotu.");
            throw new NumberFormatException();
        } catch (ArithmeticException ae) {
            System.out.println("Nelze dělit nulou.");
            throw new ArithmeticException();
        }
    }


    public void getArray() {
        for (int i = 0; i < array.length; i++) {

            System.out.printf(array[i] + " ");
        }
        System.out.println();
    }
}
