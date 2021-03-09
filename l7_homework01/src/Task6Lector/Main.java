package Task6Lector;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Journal journal = new Journal();

        Book book = new Book();
        book.author = "John";
        book.title = "Magazine";

        Person person = new Person();
        person.name = "Carl";


        JournalRecord lentRecord = JournalRecord.createLentRecord(person, book, LocalDate.now(), 10);

        journal.addJournalRecord(lentRecord);


        JournalRecord acceptedRecord = JournalRecord.createAcceptedRecord(person, book, LocalDate.now());

        journal.addJournalRecord(acceptedRecord);


        System.out.println("VYPUJCKY:");
        for (JournalRecord journalRecord : journal.getJournalRecords()) {
            if (JournalActionType.LENT == journalRecord.actionType) {
                System.out.println(journalRecord);
            }
        }

        System.out.println("VRACENO:");
        for (JournalRecord journalRecord : journal.getJournalRecords()) {
            if (JournalActionType.ACCEPTED == journalRecord.actionType) {
                System.out.println(journalRecord);
            }
        }
    }
}