package machine;

public class Main {
    public static void main(String[] args) {
        CoffeeMachineLogic coffeeMachineLogic = new CoffeeMachineLogic(400, 540, 120, 9, 550);
        CoffeeMachineUI coffeeMachineUI = new CoffeeMachineUI(coffeeMachineLogic);
        coffeeMachineUI.start();
    }
}
