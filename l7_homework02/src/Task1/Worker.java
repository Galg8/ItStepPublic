package Task1;

public class Worker {
    private String name;
    private String typeOfRenumeration;
    private String modifiedToPay;

    private long sum;
    private long tugriks;
    private long sumAfterTax;
    private int tax;

    private boolean offshore;
    private boolean children;

    public Worker(String name, String typeOfRenumeration, long sum) {
        this.name = name;
        this.sum = sum;
        this.typeOfRenumeration = typeOfRenumeration;

    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getTypeOfRenumeration() {
        return typeOfRenumeration;
    }

    public long getSum() {
        return sum;
    }

    public int getTax() {
        return tax;
    }

    /*
    public long getSumAfterTax() {
    this.sumAfterTax = this.sum * (100 - this.tax) / 100;
    }
     */
    public String getSumAfterTax() {
        this.sumAfterTax = this.sum * (100 - this.tax) / 100;
        if(this.typeOfRenumeration.equals("Hourly wage")) {
            this.tugriks = (sumAfterTax / 2) / 8;

            modifiedToPay = (this.sumAfterTax / 2) + " / " + this.tugriks;
            return modifiedToPay;
        }
        else {
            modifiedToPay = this.sumAfterTax + "";
            return modifiedToPay;
        }
    }

    public String getOffshore() {
        if(!this.offshore) {
            return "no";
        }
        else {
            return "yes";
        }
    }

    public String getChildren() {
        if(!this.children) {
            return "no";
        }
        else {
            return "yes";
        }
    }


    // SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOfRenumeration(String typeOfRenumeration) {
        this.typeOfRenumeration = typeOfRenumeration;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public void setChildren(boolean stat) {
        this.children = stat;
        if(!children) {
            this.tax = tax + 5;
        }
    }

    public void setOffshore(boolean offshore) {
        this.offshore = offshore;
        if(this.offshore) {
            this.tax = 0;
        }
    }

    @Override
    public String toString() {
        return name + "\t\t" + typeOfRenumeration + "\t\t" + sum + "\n";
    }
}
