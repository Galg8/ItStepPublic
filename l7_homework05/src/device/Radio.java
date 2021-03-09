package device;

import battery.IBattery;
import battery.IChargable;
import battery.IUnchargable;

public class Radio extends Device implements IRadio{

    public Radio() {
        super(0.5, "\uD83D\uDCFB\uD83C\uDFB6","\uD83D\uDCFB", 1);
    }

    // ===== BATTERY OPTIONS
    public void inputBattery(IChargable battery1) {
        slot((IBattery) battery1, 0);
    }

    public void inputBattery(IUnchargable battery1) {
        slot((IBattery) battery1, 0);
    }

    public void removeBatteries() {
        outputBatteries();
    }
}
