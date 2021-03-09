package Task1;

import java.util.ArrayList;
import java.util.List;

public class ListOfWorkers {
    ArrayList<Worker> myList = new ArrayList<Worker>();
    private int totalStum;

    public ListOfWorkers() {
    }

    public void collectWorkers(List workers) {
        myList.addAll(workers);
    }

    private int getTotalSum() {
        for(Worker w : myList) {
            totalStum += w.getSum();
        }
        return totalStum;
    }

    public void getAfterTaxToPayTable() {
        String leftAlignFormat = "| %-13s | %-8s | %-8s | %-7d | %-10d | %-20s |%n";

        System.out.format("+------------------------------------------+----------------------------------------+%n");
        System.out.format("|      Name     | Offshore | Children | Tax, %%  |   Sum($)   |  To pay($ / tugriks) |%n");
        System.out.format("+-----------------------------------------+-----------------------------------------+%n");
        for(Worker w : myList) {
            System.out.format(leftAlignFormat, w.getName(), w.getOffshore(), w.getChildren(), w.getTax(), w.getSum(), w.getSumAfterTax());
        }
        System.out.format("+------------------------------------------+----------------------------------------+%n");
    }

    public void getTableOfWorkers() {
        String leftAlignFormat = "| %-14s | %-20s | %-10d|%n";

        System.out.format("+---------------------------+-----------------------+%n");
        System.out.format("|      Name      | Type of renumeration |   Sum($)  |%n");
        System.out.format("+---------------------------+-----------------------+%n");
        for(Worker w : myList) {
            System.out.format(leftAlignFormat, w.getName(), w.getTypeOfRenumeration(), w.getSum());
        }
        System.out.format("+---------------------------+-----------------------+%n");
        System.out.format("| Total                                   %d      |\n", getTotalSum());
        System.out.format("+---------------------------+-----------------------+%n");
    }
}
