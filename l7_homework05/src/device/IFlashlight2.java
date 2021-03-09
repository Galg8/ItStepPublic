package device;

import battery.IChargable;
import battery.IUnchargable;

public interface IFlashlight2 {
    void switchState();
    void inputBattery(IChargable battery1, IChargable battery2);
    void removeBatteries();
}
