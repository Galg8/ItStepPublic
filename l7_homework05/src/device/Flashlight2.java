package device;

import battery.IBattery;
import battery.IChargable;
import battery.IUnchargable;

public class Flashlight2 extends Device implements IFlashlight2{

    public Flashlight2() {
        super(1.0, "\uD83D\uDDE6\uD83D\uDCA1\uD83D\uDDE7", "  \uD83D\uDCA1 ", 2);
    }

    // ===== BATTERY OPTIONS
    public void inputBattery(IChargable battery1, IChargable battery2) {
        slot((IBattery) battery1, 0);
        slot((IBattery) battery2, 1);
    }

    public void inputBattery(IUnchargable battery1, IUnchargable battery2) {
        slot((IBattery) battery1, 0);
        slot((IBattery) battery2, 1);
    }

    public void removeBatteries() {
        outputBatteries();
    }
}
