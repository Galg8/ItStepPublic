package Task5;

public class Main {
    /*Task 5
    Implement a generic method to search for the minimum value in the array.
    */
    public static <T extends Number> Number min(T... numbers) {
        if (numbers == null || numbers.length == 0) return null;

        double min = Double.MAX_VALUE;

        for (Number number : numbers) {
            double value = number.doubleValue();

            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Number intMin = min(6, 8, 12, 30, 16, 18, 22);

        System.out.println(intMin);
    }
}
