package Task6;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        /*Task 6
        In the library, one decided to automate the accounting of books lent to students.
         In order to receive a book, the student should receive a library card if they have not received it before.
          The library card contains the following information:
          ■card number;
          ■name and surname of the student;
          ■group number.

          When a book is lent, the librarian writes down in the journal:
          ■title and author of the book;
          ■card number, for which the book is lent;
          ■date;
          ■for how long the book is lent (in days).

          When  the  book  is  accepted,  the  librarian  writes  down  in  the  journal:
          ■title and author of the book;
          ■card number of the student who returned the book;
          ■return date.

          Develop  a  model  of  the  program  that  would  allow  finding  debtors (students who did not bring the book on time).*/
        Journal journal = new Journal();
        // KNIHY
        journal.collectNewBook(0,"Od nuly k jedničce", "Peter Thiel");
        journal.collectNewBook(1,"Satoshi's Vision: The Art of Bitcoin", "Craig Steven Wright");
        journal.collectNewBook(2,"Mistrovství Javy", "Herbert Schildt");

        // STUDENTI
        Person student1 = new Person("Jan","Pála", 687,1);
        Person student2 = new Person("Petr", "Vetchý", 166, 2);
        Person student3 = new Person("Tomáš", "Buřt", 223, 1);

        System.out.println(journal.getListOfDebtors());
        System.out.println(journal.getListOfLibrary());
        student1.borrowBook(2, 20);
        //System.out.println(Person.book);

        System.out.println(journal.getListOfDebtors());
        System.out.println(journal.getListOfLibrary());
/*
        student1.returnTheBook();
        System.out.println(journal.getListOfDebtors());
        System.out.println(journal.getListOfLibrary());*/
    }
}
