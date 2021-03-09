package device;

import battery.IBattery;
import battery.IChargable;
import battery.IUnchargable;

public interface IRadio {
    void switchState();
    void removeBatteries();
}
