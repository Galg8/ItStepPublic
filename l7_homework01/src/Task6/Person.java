package Task6;

import java.time.LocalDate;

public class Person {
    private final String studentName;
    private final String studentSurname;
    private final int cardNumber;
    private int groupNumber;
    private LocalDate date;
    private int lentDays;
    private Book book;
    private Person person;


    public Person(String studentName, String studentSurname, int cardNumber, int groupNumber) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.cardNumber = cardNumber;
        this.groupNumber = groupNumber;
        this.book = book;
    }

    public void borrowBook(int bookCode, int lentDays) {
        person = new Person(this.studentName, this.studentSurname,this.cardNumber, this.groupNumber);
        this.book = Journal.lentOut(person, bookCode);
        person.book = this.book;
        Journal.plusDebtor(person, LocalDate.now(), lentDays);
    }

    public void returnTheBook() {
        person = new Person(this.studentName, this.studentSurname,this.cardNumber, this.groupNumber);
        this.book = Journal.broughtBack(person, this.book);

    }

    // SETTERY


    // GETTERY
    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public Book getBook() {
        return book;
    }

    public void setLentTime(LocalDate date, int lentDays) {
        this.date = date;
        this.lentDays = lentDays;
    }

    public String printLentTime() {
        return "Datum vypujčení: " + date + "\nVypujčení na: " + lentDays + " dny";
    }

    @Override
    public String toString() {
        return "Jméno: " + studentName + "\nPříjmení: " + studentSurname + "\nČíslo karty: " + cardNumber + "\nSkupina: " + groupNumber +"\n" + book;
    }
}
