package machine;

public class CoffeeMachineLogic {
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;
    private int coffeesMade; // Counter for the number of coffees made

    public CoffeeMachineLogic(int water, int milk, int beans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
        this.coffeesMade = 0;
    }

    // Display current state of the coffee machine
    public void printState() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money\n");
    }

    // Check if resources are sufficient for the requested coffee type
    private boolean checkResources(CoffeeCupType type) {
        if (water < type.getWaterNeeded()) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        if (milk < type.getMilkNeeded()) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        if (beans < type.getBeansNeeded()) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        }
        if (cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
            return false;
        }
        return true;
    }

    // Make coffee if resources are available
    public void makeCoffee(CoffeeCupType type) {
        if (checkResources(type)) {
            water -= type.getWaterNeeded();
            milk -= type.getMilkNeeded();
            beans -= type.getBeansNeeded();
            cups--;
            money += type.getCost();
            coffeesMade++; // Increment the count of coffees made
            System.out.println("I have enough resources, making you a coffee!");
        }

        // Check if cleaning is required
        if (coffeesMade >= 10) {
            System.out.println("I need cleaning!");
        }
    }

    // Fill resources in the coffee machine
    public void fill(int water, int milk, int beans, int cups) {
        this.water += water;
        this.milk += milk;
        this.beans += beans;
        this.cups += cups;
    }

    // Withdraw money from the coffee machine
    public void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    // Clean the coffee machine
    public void clean() {
        coffeesMade = 0; // Reset coffee count after cleaning
        System.out.println("I have been cleaned!");
    }

    public boolean needsCleaning() {
        return coffeesMade >= 10;
    }
}
