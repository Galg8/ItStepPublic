package Task6;

import java.time.LocalDate;
import java.util.ArrayList;

public class Journal {

    private static ArrayList<Book> library =  new ArrayList<Book>();
    private static ArrayList<Person> debtors = new ArrayList<Person>();
    private static Book book;


    public void collectNewBook(int bookCode, String title, String author) {
        library.add(new Book(bookCode, title, author));
    }

    public static Book lentOut(Person person, int bookCode) {
        book = library.get(bookCode);
        library.remove(bookCode);
        System.out.println("Kniha byla pujčena studentovi s kartou " + person.getCardNumber() + " a je zapsán do evidence dlužníků.");
        return book;
    }
    public static void plusDebtor(Person person,LocalDate date, int lentDays) {
        person.setLentTime(date, lentDays);
        debtors.add(person);
    }

    public static Book broughtBack(Person person, Book book) {
        debtors.remove(person);
        library.add(book);
        System.out.println("Kniha byla vrácena a student s kartou " + person.getCardNumber() + " je vyjmut z evidence dlužníků.");
        return null;
    }

    public String getListOfDebtors() {
        String vypis = "\n";
        for(Person p : debtors) {
            vypis += p.toString() + p.printLentTime();
        }
        return vypis;
    }

    public String getListOfLibrary() {
        String vypis = "\n";
        for(Book b : library) {
            vypis += b.toString();
        }
        return vypis;
    }
}
