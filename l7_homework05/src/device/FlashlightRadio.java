package device;

import battery.IBattery;
import battery.IChargable;
import battery.IUnchargable;

public class FlashlightRadio extends Device implements IFlashlight2,IRadio{

    public FlashlightRadio() {

        super(1.0, produceOn, produceOff, batteryStorageCount);
    }

    @Override
    public void switchState() {

    }

    @Override
    public void inputBattery(IChargable battery1, IChargable battery2) {
        slot((IBattery) battery1, 0);
        slot((IBattery) battery2, 1);
    }

    @Override
    public void removeBatteries() {
        outputBatteries();
    }
}
