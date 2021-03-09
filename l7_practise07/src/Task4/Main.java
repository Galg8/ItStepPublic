package Task4;

import Task2.Practise2;

public class Main {
    /*
    Task 4
    Implement a generic method to search for the maximum value in the array.
     */


    public static <T extends Number> Number max(T... numbers) {
        if (numbers == null || numbers.length == 0) return null;

        double max = Double.MIN_VALUE;

        for (Number number : numbers) {
            double value = number.doubleValue();

            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Number intMax = max(6, 8, 12, 30, 16, 18, 22);

        System.out.println(intMax);
    }
}
