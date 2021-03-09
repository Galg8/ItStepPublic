package Task6Lector;

import java.time.LocalDate;

public class JournalRecord {
    public JournalActionType actionType;
    public LocalDate lentFrom;
    public LocalDate acceptedAt;
    public int lentDays;
    public Book book;
    public Person person;


    private JournalRecord(
            Person person,
            Book book,
            LocalDate lentFrom,
            int lentDays
    ) {
        this.actionType = JournalActionType.LENT;
        this.lentFrom = lentFrom;
        this.lentDays = lentDays;
        this.book = book;
        this.person = person;
    }

    private JournalRecord(Person person,
                          Book book,
                          LocalDate acceptedAt
    ) {
        this.actionType = JournalActionType.ACCEPTED;
        this.acceptedAt = acceptedAt;
        this.book = book;
        this.person = person;
    }

    public static JournalRecord createLentRecord(Person person,
                                                 Book book,
                                                 LocalDate lentFrom,
                                                 int lentDays
    ) {
        return new JournalRecord(person, book, lentFrom, lentDays);
    }

    public static JournalRecord createAcceptedRecord(Person person, Book book,
                                                     LocalDate acceptedAt
    ) {
        return new JournalRecord(person, book, acceptedAt);
    }

    @Override
    public String toString() {
        return "JournalRecord{" +
                "actionType=" + actionType +
                ", lentFrom=" + lentFrom +
                ", acceptedAt=" + acceptedAt +
                ", lentDays=" + lentDays +
                ", book=" + book +
                ", person=" + person +
                '}';
    }
}