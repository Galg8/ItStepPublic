package battery;

public interface IBattery {
    double getCharge();
    boolean charge(double chargeConsumption);
}
