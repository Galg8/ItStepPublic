package Task1;

abstract class CoffeeMachine{
    private int groundCoffee;           //  Espreso 22grams     Americano 22grams
    private int waterMililitres;       //  Espresso 30ml        Americano 100ml
    private int spentCoffeeTank;

    public abstract void chooseYourDemand(int command);
    public abstract void showButtons();
    public abstract void showStorage();
    public abstract void drainSpentCoffe();
    public abstract void fillWater();
    public abstract void fillCoffee();
    public abstract void clearSpentTank();
    //protected abstract void makeEspresso();
    protected abstract void makeAmericano();
    protected abstract boolean checkConditions();
    protected abstract void powerOn();
    protected abstract void powerOff();

    public static void progressPercentage(int remain, int total) {
        if (remain > total) {
            throw new IllegalArgumentException();
        }
        int maxBareSize = 10; // 10unit for 100%
        int remainProcent = ((100 * remain) / total) / maxBareSize;
        char defaultChar = '-';
        String icon = "█";
        String bare = new String(new char[maxBareSize]).replace('\0', defaultChar) + "]";
        StringBuilder bareDone = new StringBuilder();
        bareDone.append("[");
        for (int i = 0; i < remainProcent; i++) {
            bareDone.append(icon);
        }
        String bareRemain = bare.substring(remainProcent, bare.length());
        System.out.print("\r" + bareDone + bareRemain + " " + remainProcent * 10 + "%");
        if (remain == total) {
            System.out.print("\n");
        }
    }

    // KIND OF CUPS
    public void visualProcessCup() {
    for (int i = 0; i <= 200; i = i + 20) {
            CoffeeMachine.progressPercentage(i, 200);
            try {
                Thread.sleep(750);
            } catch (Exception e) {
            }
        }
    }

    public void noWater() {
            System.out.println("There is no water.");
    }

    public void noGroundCoffee() {
            System.out.println("There is no ground coffee.");
    }

    public void spentTankOverflowed() {
            System.out.println("The tank with the spent coffee is overflowed.");
    }


    // SETTERY
/*
    public void fillMachineWater() {
        this.machineWaterLeft = machineWaterLeft;
    }

    public void fillMachineCoffe() {
        this.machineCoffeLeft = machineCoffeLeft;
    }
*/
}
