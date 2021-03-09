package Task4;

import Task2.GreaterNumberException;
import Task2.NegativeNumberException;

import java.util.Arrays;

public class Main {

    public static int binarySearch(byte[] a, byte key) throws UnsortedException{
        try {
            Arrays.binarySearch(a,key);
        }
        catch (NumberFormatException nfe) {
            throw new NumberFormatException();
            }

        for(int i = 0; i < a.length - 1; i++) {
        if(a[i] > a[i+1]) {
            throw new UnsortedException();
            }
        }
        int myIndex = Arrays.binarySearch(a,key);
        return myIndex;
    }

    public static void main(String[] args) throws UnsortedException {
        byte[] byteArr = {10,20,15,22,35,12,8,6,2};

        Arrays.sort(byteArr);

        byte byteKey = 12;

        System.out.println(byteKey + " found at index = "
                + Main.binarySearch(byteArr,byteKey));

    }
}
