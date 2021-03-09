package device;

import battery.Accumulator;
import battery.IBattery;

public class FlashlightLED extends Device{
    public FlashlightLED() {
        super(0.3333333333333333, "\uD83D\uDDE6\uD83D\uDCA1\uD83D\uDDE7", "  \uD83D\uDCA1 ", 3);
    }

    // ===== BATTERY OPTIONS
    public void inputBattery(Accumulator battery1, Accumulator battery2, Accumulator battery3) {
        slot(battery1,0);
        slot(battery2,1);
        slot(battery3,2);
    }

    public void removeBatteries() {
        outputBatteries();
    }
}
