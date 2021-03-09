import battery.Accumulator;
import battery.ChinaBattery;
import battery.Duracell;
import battery.IUnchargable;
import battery.IChargable;
import device.*;
import device.Flashlight;

public class Test {

    static void testClicker(IDevice device, int clickCount) {
        for(int i = 0; i < clickCount; i++) {
            device.switchState();
        }
    }

    public static void main(String[] args) {
        // ==== DEVICES
        Flashlight fl = new Flashlight();
        Radio radio = new Radio();
        Flashlight2 fl2 = new Flashlight2();
        FlashlightLED fld = new FlashlightLED();

        // ==== BATTERIES
        IUnchargable china = new ChinaBattery();
        IUnchargable duracell = new Duracell();
        IChargable accumulator = new Accumulator();


        //  ================== TESTS 1 ====================== //
        /*System.out.println("\nFlashlight with China battery.");
        fl.inputBattery(china);
        testClicker(fl, 11);
        fl.outputBatteries();

        System.out.println("\nFlashlight with Duracell battery.");
        fl.inputBattery(duracell);
        testClicker(fl, 21);
        fl.outputBatteries();

        System.out.println("\nFlashlight with Accumulator battery.");
        fl.inputBattery(accumulator);
        testClicker(fl, 141);
        fl.outputBatteries();
*/
        //  ================== TESTS 2 ====================== //
        /*System.out.println("\nRadio with china battery.");
        radio.inputBattery(china);
        testClicker(radio, 21);
        radio.outputBatteries();

        System.out.println("\nRadio with duracell battery.");
        radio.inputBattery(duracell);
        testClicker(radio, 41);
        radio.removeBatteries();

        System.out.println("\nRadio with accumulator battery.");
        radio.inputBattery(accumulator);
        testClicker(radio, 281);
        radio.removeBatteries();*/

        //  ================== TESTS 3 ====================== //
        /*System.out.println("\nFlashlight with 2x China battery.");
        IUnchargable china1 = new ChinaBattery();
        fl2.inputBattery(china, china1);
        testClicker(fl2, 21);
        fl2.outputBatteries();*/

        /*System.out.println("\nFlashlight with 1x Duracell and 1x China battery.");
        IUnchargable duracell1 = new Duracell();
        fl2.inputBattery(china, duracell);
        testClicker(fl2, 31);
        fl2.outputBatteries();*/

        System.out.println("\nFlashlight with 2x Duracell battery.");
        IUnchargable duracell1 = new Duracell();
        fl2.inputBattery(duracell1, duracell);
        testClicker(fl2, 41);
        fl2.outputBatteries();

        //System.out.println("\nFlashlight with 2x Accumulator battery.");
        // FLASHLIGHT - DURACELL
       /* System.out.println("\nFlashlight with Duracell battery.");
        fl.inputBattery(duracell);
        testClicker(fl, 21);*/

        // FLASHLIGHT - ACCUMULATOR
        /*System.out.println("\nFlashlight with Accumulator.");
        fl.inputBattery(accumulator);
        testClicker(fl, 141);*/
    }
}
