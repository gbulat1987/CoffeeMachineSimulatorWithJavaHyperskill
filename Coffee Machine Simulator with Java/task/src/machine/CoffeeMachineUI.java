package machine;

import java.util.Scanner;

public class CoffeeMachineUI {
    private final CoffeeMachineLogic coffeeMachineLogic;
    private final Scanner scanner;
    private final CoffeeCupType espresso;
    private final CoffeeCupType latte;
    private final CoffeeCupType cappuccino;

    public CoffeeMachineUI(CoffeeMachineLogic coffeeMachine) {
        this.coffeeMachineLogic = coffeeMachine;
        this.scanner = new Scanner(System.in);
        this.espresso = new CoffeeCupType(250, 0, 16, 4);
        this.latte = new CoffeeCupType(350, 75, 20, 7);
        this.cappuccino = new CoffeeCupType(200, 100, 12, 6);
    }

    public void start() {
        while (true) {
            System.out.print("Write action (buy, fill, take, clean, remaining, exit): ");
            String action = scanner.next();

            switch (action) {
                case "buy":
                    handleBuy();
                    break;
                case "fill":
                    handleFill();
                    break;
                case "take":
                    handleTake();
                    break;
                case "clean":
                    handleClean();
                    break;
                case "remaining":
                    handleRemaining();
                    break;
                case "exit":
                    return;  // Exit the program
                default:
                    System.out.println("Invalid action. Please try again.");
            }
        }
    }

    private void handleRemaining() {
        coffeeMachineLogic.printState();
    }

    private void handleTake() {
        coffeeMachineLogic.take();
    }

    // Process buying coffee
    private void handleBuy() {
        if (coffeeMachineLogic.needsCleaning()) {
            System.out.println("I need cleaning!");
            return;
        }

        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choice = scanner.next();

        switch (choice) {
            case "1":
                coffeeMachineLogic.makeCoffee(espresso);
                break;
            case "2":
                coffeeMachineLogic.makeCoffee(latte);
                break;
            case "3":
                coffeeMachineLogic.makeCoffee(cappuccino);
                break;
            case "back":
                return;  // Return to the main menu
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // Process filling resources
    private void handleFill() {
        System.out.print("Write how many ml of water you want to add: ");
        int water = scanner.nextInt();
        System.out.print("Write how many ml of milk you want to add: ");
        int milk = scanner.nextInt();
        System.out.print("Write how many grams of coffee beans you want to add: ");
        int beans = scanner.nextInt();
        System.out.print("Write how many disposable cups you want to add: ");
        int cups = scanner.nextInt();
        coffeeMachineLogic.fill(water, milk, beans, cups);
    }

    // Process cleaning the machine
    private void handleClean() {
        coffeeMachineLogic.clean();
    }
}
