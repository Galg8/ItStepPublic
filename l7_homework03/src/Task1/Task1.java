package Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        /*
        Task 1
         The factory produces different models of coffee machines with different characteristics.
         The  coffee  machine  is  loaded  with  ground  coffee  and  water.
          The maximum load values depend on the model.To prepare one cup of coffee, you need:
          ■22 grams of ground coffee and 30 ml of water for espresso;
          ■22 grams of ground coffee and 100 ml of water for Americano.
          The spent coffee is thrown into a special tank;
           the capacity of the tank depends on the model.The coffee machine can give various errors while working.
           ■There is no water.
           ■There is no ground coffee.
           ■The tank with the spent coffee is overflowed.
           The coffee machine has the following buttons:
           ■Power On.
           ■Power Off.
           ■Make espresso.Make Americano.
           ■Clean the tank with the spent coffee.
         */
        Scanner sc = new Scanner(System.in);

        String model;
        int command;

        System.out.println("Vyber si typ kávovaru zadáním zkratek O = Model Classic, CL = Model Cappucino a Latté plus, nebo EA = Model EA:");
        model = sc.nextLine().toUpperCase();
        CoffeeMachine myMachine = null;
        outter:
        switch (model) {
            case "O":
                myMachine = new ModelClassic();
                break;
            case "EA":
                myMachine = new ModelEA();
                break;
            case "CL":
                myMachine = new ModelCLplus();
                break;
            default:
                System.out.println("Nezadal si platný model kávovaru");
                break outter;
        }

        System.out.println("Vybral si model " + model + ".");


        while (true) {
            myMachine.showButtons();
            command = Integer.parseInt(sc.nextLine());
            myMachine.chooseYourDemand(command);
        }

    }
}
