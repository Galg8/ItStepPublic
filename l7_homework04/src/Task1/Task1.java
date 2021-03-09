package Task1;

public class Task1 {
    /*Task 1
     Write a test that checks the work of the flashlight.
     There should be the following checks:
     ■The created flashlight should not give light.
     ■After turning on, the flashlight should give light.
     ■After turning off, the flashlight should not give light.
     ■After the flashlight turns on five times, it should not give light when turning on (since the battery should die).
     The test should be in the red zone.*/
    public static void main(String[] args) {
        FlashLight flashlight = new FlashLight();

        for(int i = 0; i < 11; i++) {
            flashlight.switchLight();
        }
        ChinaBattery battery = new ChinaBattery();
        flashlight.inputBattery(battery);
        for(int i = 0; i < 10; i++) {
            flashlight.switchLight();
        }
    }
}
