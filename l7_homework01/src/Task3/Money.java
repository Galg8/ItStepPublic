package Task3;

public class Money {

    private double doubleCashForm;
    private static double result;
    private static String comparation;
    private long dollars;
    private byte cents;
    private int changes;

    public Money(double cash) {
        this.doubleCashForm = cash;
        this.dollars = (long) (cash * 100) / 100;
        changes = (int) this.dollars % 100;
        this.cents = (byte) changes;
    }

    public static double workOut(Money cash1,String operator ,Money cash2) {
        switch (operator) {
            case "+" -> result = Math.abs(cash1.getDoubleCashForm() + cash2.getDoubleCashForm());
            case "-" -> result = Math.abs(cash1.getDoubleCashForm() - cash2.getDoubleCashForm());
            case "*" -> result = Math.abs(cash1.getDoubleCashForm() * cash2.getDoubleCashForm());
            case "/" -> result = (cash1.getDoubleCashForm() / cash2.getDoubleCashForm()) * 100;
            default -> result = 0.00;
        }
        return result;
    }

    public static String compare(Money cash1, Money cash2) {
        comparation = cash1.getDoubleCashForm() > cash2.getDoubleCashForm() ? " je větší než " : " je menší než ";
        return comparation;
    }

    //==== GETTERY
    public double getDoubleCashForm() {
        return this.doubleCashForm;
    }

    public long getDollars() {
        return this.dollars;
    }

    public byte getCents() {
        return this.cents;
    }

    @Override
    public String toString() {
        return dollars + "." + cents +"$";
    }

}
