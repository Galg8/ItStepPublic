package Task6;

import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class Main {
    /*
    Task 6
    Implement a generic method to sort the array.
    */
    public static <T extends Number> List sortThem(T... numbers) {
        if (numbers == null || numbers.length == 0) return null;
        List myArray = Arrays.asList(numbers);
        Collections.sort(myArray);
        return myArray;
    }
    public static void main(String[] args) {

        List myArray = sortThem(6, 8, 12, 30, 16, 18, 22);

        System.out.println(myArray);
    }
}
