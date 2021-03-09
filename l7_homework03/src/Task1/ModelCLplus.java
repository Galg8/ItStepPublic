package Task1;

public class ModelCLplus extends CoffeeMachine {
    /*
    Task 2
    After modernization, the factory began to produce new coffee machines,  which,  in  addition  to  the  previous  functions,
      make  cappuccino and latte.
      The  built-in  container  for  milk  is  added,  the  size  of  the  container depends on the brand of the coffee machine.
      A new error is added:
      ■There is no milk.
      New buttons are added:
      ■Make latte.
      ■Make cappuccino.
      The amount of milk that is spent to make cappuccino and latte is set during cooking.
    The amount of coffee and water is the same as when making a cup of espresso.
    Test new models of coffee machines. All previous tests should be green.
    Reuse the code from the previous task.*/
    private int machineWaterLeft = 1000;
    private int machineCoffeLeft = 220;
    private int machineWaterCap = 1000;
    private int machineCoffeCap = 220;
    private int milkMililitres;
    private int machineMilkLeft = 1000;
    private int machineMilkCap = 1000;

    private int spentCoffeeTank;
    protected int capCount = 0;
    private boolean power = false;
    private boolean condition;

    @Override
    public void showButtons() {
        System.out.println("0: Power Off\n1: Power On\n2: Make Espresso\n3: Make Americano\n4: Make Cappucino\n5: Make Latte\n6: Clear spent tank\n9: Exit");
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

    // BUTTON 4
    public void makeCappucino(){
        if(checkConditions()) {
            visualProcessCup();
            this.machineCoffeLeft -= 22;
            this.machineWaterLeft -= 30;
            this.machineMilkLeft -= 120;
            this.capCount++;
            System.out.println("Your Cappucino is done. Enjoy your meal.\n");
        }
    }

    // BUTTON 5
    public void makeLatte(){
        if(checkConditions()) {
            visualProcessCup();
            this.machineCoffeLeft -= 22;
            this.machineWaterLeft -= 30;
            this.machineMilkLeft -= 200;
            this.capCount++;
            System.out.println("Your Latte is done. Enjoy your meal.\n");
        }
    }

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

    // BUTTON 9
    @Override
    public void showStorage() {
        System.out.println("Zásoba kávy: " + this.machineCoffeLeft);
        System.out.println("Zásoba vody: " + this.machineWaterLeft);
        System.out.println("Zásoba mléka: " + this.machineCoffeLeft);
        System.out.println("Kapacita kávy: " + this.machineCoffeCap);
        System.out.println("Kapacita vody: " + this.machineWaterCap);
        System.out.println("Kapacita mléka: " + this.machineMilkLeft);
        System.out.println();
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
                case 5:
                    makeCappucino();
                    break;
                case 6:
                    makeLatte();
                    break;
                case 8:
                    showStorage();
                    break;
                case 9:
                    System.out.println("Ukončuji program...");
                    System.exit(0);
                default:
                    System.out.println("Špatný příkaz");
            }
        }
}
