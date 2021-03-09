package Task2;

import Task1.Practise1;

public class Main {
    public static void main(String[] args) {
        Number intMin = new Practise2<Integer>().min(5, 7, 6);

        System.out.println(intMin);

    }
}
