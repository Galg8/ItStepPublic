package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Task 1
         Create  a  method  that  outputs  to  the  console  the  result  of  an  integer  division  of  a  number  entered
           from  a  keyboard  by  the  value  of  single-dimension  array  elements  of  integers  randomly  filled from -10 to 10.
            Array length is random: from 1 to 10.
            Handle all possible exceptions in this method.
         */
        Scanner sc = new Scanner(System.in);
        String input;
        MyArray myArray = new MyArray();

        System.out.println("Napiš číslo:");
        input = sc.nextLine();
        myArray.getArray();
        myArray.division(input);
    }
}
