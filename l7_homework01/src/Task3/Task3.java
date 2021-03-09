package Task3;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 3 Create a Money class to work with money. The number should be represented by two fields:
         ■ long type for dollars;
         ■ byte type for cents.
         Implement  the  output  of  the  value  to  the  screen  so  that  the  fractional
          part is separated from the whole part by dot. Implement addition,  subtraction,  division  of  sums,
            division  of  the  sum  by  a fractional number, multiplication by a fractional number, and comparison operations.
             Test using JUnit.
         */
        Money cash1 = new Money(123.45);
        Money cash2 = new Money(678.90);

        System.out.println("Částka první: " + cash1);
        System.out.println("Částka druhá: " + cash2);

        Money sumCash = new Money(Money.workOut(cash1,"+",cash2));
        Money subCash = new Money(Money.workOut(cash1,"-",cash2));
        Money mulCash = new Money(Money.workOut(cash1,"*",cash2));
        double divCash = Money.workOut(cash1,"/",cash2);

        System.out.println("Součet: " + sumCash);
        System.out.println("Rozdíl: " + subCash);
        System.out.println("Součin: " + mulCash);
        System.out.printf("Podíl: %.2f%%\n", divCash);

        System.out.println(cash1 + Money.compare(cash1,cash2) + cash2);
    }
}
