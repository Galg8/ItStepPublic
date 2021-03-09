package Task6;

import java.time.LocalDate;

public class Book {
    private final int bookCode;
    private final String title;
    private final String author;

    public Book(int bookCode,String title, String author) {
        this.bookCode = bookCode;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Kód knihy: " + bookCode + "\tNázev knihy: " + title + "\tAutor: " + author + "\n";
    }
}
