package machine;

public class CoffeeCupType {
    private final int waterNeeded;
    private final int milkNeeded;
    private final int beansNeeded;
    private final int cost;

    public CoffeeCupType(int waterNeeded, int milkNeeded, int beansNeeded, int cost) {
        this.waterNeeded = waterNeeded;
        this.milkNeeded = milkNeeded;
        this.beansNeeded = beansNeeded;
        this.cost = cost;
    }

    public int getWaterNeeded() {
        return waterNeeded;
    }

    public int getMilkNeeded() {
        return milkNeeded;
    }

    public int getBeansNeeded() {
        return beansNeeded;
    }

    public int getCost() {
        return cost;
    }
}
