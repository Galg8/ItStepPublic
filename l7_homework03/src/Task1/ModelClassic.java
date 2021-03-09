package Task1;

public class ModelClassic extends CoffeeMachine{
    private int machineWaterLeft = 1000;
    private int machineCoffeLeft = 220;
    private int machineWaterCap = 1000;
    private int machineCoffeCap = 220;
    private int spentCoffeeTank;
    protected int capCount = 0;
    private boolean power = false;
    private boolean condition;

    @Override
    public void showButtons() {
        System.out.println("0: Power Off\n1: Power On\n2: Make Espresso\n3: Make Americano\n4: Clear spent tank\n9: Show storage condition\n10: Exit");
    }

    // BUTTON 0
    @Override
    protected void powerOff() {
        System.out.println("Power on.");
        power = false;
    }

    // BUTTON 1
    @Override
    protected void powerOn() {
        System.out.println("Power on.");
        power = true;
    }

    // BUTTON 2
    public void makeEspresso() {
        if(checkConditions()) {
            machineCoffeLeft -= 22;
            machineWaterLeft -= 30;
            capCount++;
            visualProcessCup();
            System.out.println("Your Espresso is done. Enjoy your meal.\n");
        }
    }

    // BUTTON 3
    @Override
    public void makeAmericano() {
        if(checkConditions()) {
            this.machineCoffeLeft -= 22;
            this.machineWaterCap -= 100;
            this.capCount++;
            visualProcessCup();
            System.out.println("Your Americano is done. Enjoy your meal.\n");
        }
    }

    // BUTTON 5

    // BUTTON 6

    // BUTTON 7
    @Override
    public void fillCoffee() {
        if(machineCoffeLeft == 0) {
            machineCoffeLeft = machineCoffeCap;
        }
        else {
            System.out.println("First drain spent coffee...");
        }
    }

    // BUTTON 8
    @Override
    public void fillWater() {
        machineWaterLeft = machineWaterCap;
    }

    // BUTTON 9
    @Override
    public void drainSpentCoffe() {
        if(machineWaterLeft < 30) {
            System.out.println("You have to fill water into the machine.");
        }
        else if((spentCoffeeTank + machineCoffeLeft + 30) > 250) {
            System.out.println("Spent coffee tank is full.");
        }
        else {
            this.spentCoffeeTank += machineCoffeLeft + 30;
            machineCoffeLeft = 0;
            machineWaterLeft -= 30;
        }
    }
    // BUTTON 9
    @Override
    public void clearSpentTank() {
        spentCoffeeTank = 0;
    }

    // BUTTON 10
    @Override
    public void showStorage() {
        System.out.println("Coffee left: " + machineCoffeLeft);
        System.out.println("Water left: " + machineWaterLeft);
        System.out.println("Coffee cap: " + machineCoffeCap);
        System.out.println("Water cap: " + machineWaterCap);
    }




    // SYSTEM METHODS
    @Override
    protected boolean checkConditions()  {
        if(!power) {
            System.out.println(" ... (Coffe machine is off) ...");
            condition = false;
            return condition;
        }
        else {
            if(machineWaterLeft < 30) {
                noWater();
                condition = false;
                return condition;
            }
            else if(machineCoffeLeft < 22) {
                noGroundCoffee();
                condition = false;
                return condition;
            }
            else {
                condition = true;
                return condition;
            }
        }
    }


    @Override
    public void chooseYourDemand(int command) {
        switch (command) {
            case 0:
                powerOff();
                break;
            case 1:
                powerOn();
                break;
            case 2:
                makeEspresso();
                break;
            case 3:
                makeAmericano();
                break;
            case 4:
                spentTankOverflowed();
                break;
            case 9:
                showStorage();
                break;
            case 10:
                System.out.println("Ukončuji program...");
                System.exit(0);
            default:
                System.out.println("Špatný příkaz");
        }
    }
}
