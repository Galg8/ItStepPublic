package Task1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        /*Task 1 Create a program that allows you to enter n ranges of integer values (for example, 3-10)
        from the keyboard. Each range has a start point and an end point. After entering ranges, the program
         should  display  the  length  of  each  range.  The  program  should  display an error message
          if the beginning of the range is greater than the end. Test using Junit.*/

        /*Task 2
        For  task  1,  add  the  ability  to  test  whether  different  ranges  of  values intersect. */
        String input1, input2;
        Scanner sc = new Scanner(System.in);
        String isIntersect = "Intervaly se nepronikají.";

        try {
            //  Block of code to try
            System.out.println("Vítej u výpočtu vzdálenosti dvou dvojic čísel mezi sebou a jestli se intervaly prolínají." +
                    "\nZadej počáteční hodnotu 1.intervalu:");
            input1 = sc.nextLine();
            System.out.println("Zadej konečnou hodnotu 1.intervalu:");
            input2 = sc.nextLine();
            Ranger range1 = new Ranger(input1,input2);

            System.out.println("Zadej počáteční hodnotu 2.intervalu:");
            input1 = sc.nextLine();
            System.out.println("Zadej konečnou hodnotu 2.intervalu:");
            input2 = sc.nextLine();
            Ranger range2 = new Ranger(input1,input2);

            if(range1.getStarter() > range1.getEnder()) {
                System.out.println("Koncová hodnota 1.intervalu je vyšší než hodnota počáteční!");
                return;
            }
            else if (range2.getStarter() > range2.getEnder()) {
                System.out.println("Koncová hodnota 2.intervalu je vyšší než hodnota počáteční!");
                return;
                }

            for (int i = range1.getStarter(); i < range1.getEnder(); i++) {
                for (int j = range2.getStarter(); j < range2.getEnder(); j++) {
                    if ( i == j) {
                        isIntersect = "Intervaly sebou pronikají.";
                    }
                }
            }

            System.out.println("Vzdálenost mezi " + range1.getStarter() + " a " + range1.getEnder() + " prvního intervalu je " + range1.throwRange());
            System.out.println("Vzdálenost mezi " + range2.getStarter() + " a " + range2.getEnder() + " druhého intervalu je " + range2.throwRange());

            System.out.println(isIntersect);
        }
        catch(Exception e) {
            //  Block of code to handle errors
            System.out.println("Nezadal si celočíselnou hodnotu.");
            return;
        }
    }
}
