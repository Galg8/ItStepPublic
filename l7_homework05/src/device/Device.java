package device;
import battery.*;

abstract class Device implements IDevice{
    protected double chargeConsumption;
    protected boolean state = false;
    protected String produceOn;
    protected String produceOff;
    protected int batteryStorageCount;
    protected IBattery[] batteryStorage;
    private boolean throwSuccess;

    public Device(double chargeConsumption, String produceOn, String produceOff, int batteryStorageCount) {
        this.chargeConsumption = chargeConsumption;
        this.produceOn = produceOn;
        this.produceOff = produceOff;
        this.batteryStorage = new IBattery[batteryStorageCount];
        this.batteryStorageCount = batteryStorageCount;
    }

    //  ======= BATTERY LOGIC HELPERS ========== //
    public boolean takeChargeFromBatteries() {
        end:
        for (int i = 0; i < batteryStorageCount; i++) {
            if (batteryStorage[i] != null && batteryStorage[i].getCharge() > 0) {
                batteryStorage[i].charge(chargeConsumption);
                throwSuccess = true;
                break;
            } else {
                throwSuccess = false;
                continue;
            }
        }

        return throwSuccess;
    }

    public void slot(IBattery battery, int slot) {
        if(this.batteryStorage[slot] == null) {
            this.batteryStorage[slot] = battery;
            System.out.println("The battery has been inserted");
        }
        else {
            System.out.println("Some kind of battery is already inserted in batteryStorage " + slot + ".");
        }
    }

    public void clearSlot(int slot) {
        if(batteryStorage[slot] != null) {
            this.batteryStorage[slot] = null;
            System.out.println("The battery has been removed from the storage " + (slot+1));
        }
        else {
            System.out.println("The battery storages are already empty.");
        }
    }

    //  ========= OTHER LOGIC
    public void on() {
        this.state = true;
    }

    public void off() {
        this.state = false;
    }

    public void switchState() {
        if(state) {
            off();
            System.out.println(produceOff);
        }
        else {
            if(takeChargeFromBatteries()) {
                on();
                System.out.println(produceOn);
                //System.out.println(batteryStorage[0].getCharge());
            }
            else {
                System.out.println("Battery is exhausted...");
            }
        }
    }

    public void outputBatteries() {
        for(int i = 0; i < batteryStorageCount; i++) {
            clearSlot(i);
        }
    }
}
