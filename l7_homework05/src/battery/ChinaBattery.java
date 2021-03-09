package battery;

public class ChinaBattery extends Battery implements IUnchargable{
    /*Task 3
    Create a ChinaBattery class of the Chinese battery.
    Add to the battery class:
    â–  A class field for keeping the current charge: private int charge.
    â–  The boolean charge() method that reduces the battery charge and returns true if the charge has been reduced and false if the battery has run down.
     Add a class property with the private:private ChinaBattery battery = new ChinaBattery();
     Add  the  use  of  battery  to  the  method  of  turning  on  the  flashlight.
     The test should remain in the green zone.*/

    public ChinaBattery() {
        super(5.0, 5.0);
    }
}
