package battery;

abstract class Battery implements IBattery{
    protected double charge;
    protected final double capacity;

    public Battery(double charge, double capacity) {
        this.charge = charge;
        this.capacity = capacity;
    }

    public boolean charge(double chargeConsumption) {
        if(charge > 0) {
            this.charge -=  chargeConsumption;
            System.out.println(getCharge());
            return true;
        }
        else {
            return false;
        }
    }

    public double getCharge() {
        return this.charge;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public void recharge() {
        this.charge = this.capacity;
        System.out.println("Battery has been fully recharged.");
    }
}
