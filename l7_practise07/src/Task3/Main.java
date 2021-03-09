package Task3;

import Task1.Practise1;

public class Main {

    public static <T extends Number> Number average(T... numbers) {
        if(numbers == null | numbers.length ==0) return null;

        double average = 0;
        double totalValue = 0;
        for (Number number : numbers) {
            double value = number.doubleValue();
            totalValue += value;
        }
        average = totalValue / numbers.length;
        return average;
    }

    public static void main(String[] args) {

        Number average = average(1, 7, 6,5,9,10,13,22);

        System.out.println(average);
    }
}
