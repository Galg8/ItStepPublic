package Task5;

public class Task5 {
    public static void main(String[] args) {
        /*
        Task 5
        Develop a program for the representation of complex numbers with  the  ability  to  specify  the  real
          and  imaginary  parts  by  both  numbers of double types and integers. Ensure the execution of operations:
          ■ comparison of numbers;
          ■ addition;
          ■ subtraction;
          ■ multiplication.Test using JUnit.
         */

        ComplexNumber complex1 = new ComplexNumber(1,3);
        ComplexNumber complex2 = new ComplexNumber(3,2);

        ComplexNumber addition = ComplexNumber.addition(complex1,complex2);
        ComplexNumber subtraction = ComplexNumber.subtraction(complex1,complex2);
        ComplexNumber multiply = ComplexNumber.multiply(complex1,complex2);
        String compare = ComplexNumber.compare(complex1, complex2);

        System.out.println("Součet: " + addition);
        System.out.println("Rozdíl: " + subtraction);
        System.out.println("Součin: " + multiply);
        System.out.println(compare);

    }
}
