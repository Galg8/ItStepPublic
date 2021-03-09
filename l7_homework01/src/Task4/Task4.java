package Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*Task 4
        Describe the MainString base class.
         Required fields of the class are:
         ■Array of characters.
         ■Value of the int type stores the length of the string in characters.
         Implement mandatory methods of the following destination:
         ■constructor without parameters;
         ■constructor that takes a string literal as a parameter;
         ■constructor that accepts a character as a parameter;
         ■method for obtaining the length of a string;
         ■method of clearing a string (makes the string blank);
         ■method of searching for a character in a string.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Napiš svou větu:");

        String input = sc.nextLine();

        StringStorage myString = new StringStorage(input);
        myString.getCharray();
        System.out.println("Délka tvého řetězce: " + myString.lengthOfString());
        myString.findCharacterInCharray('c');
        myString.clearCharray();

        System.out.println();
        System.out.println("Délka tvého řetězce: " + myString.lengthOfString());

    }
}
