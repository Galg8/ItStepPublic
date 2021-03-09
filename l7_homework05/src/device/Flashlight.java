package device;

import battery.*;

public class Flashlight extends Device{

    public Flashlight() {
        super(1.0, "\uD83D\uDDE6\uD83D\uDCA1\uD83D\uDDE7", "  \uD83D\uDCA1 ", 1);
    }

    // ===== BATTERY OPTIONS
    public void inputBattery(IChargable battery1) {
        slot((IBattery) battery1, 0);
    }

    public void inputBattery(IUnchargable battery1) {
        slot((IBattery) battery1, 0);
    }

    public void removeBatteries() {
        this.outputBatteries();
    }
}
