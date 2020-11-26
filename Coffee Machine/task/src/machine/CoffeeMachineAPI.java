package machine;

interface CoffeeMachineAPI {

    void buy(Recipe recipe);

    CheckResult checkResourcesFor(Recipe recipe);

    String stateToString();

    void addWater(int amount);

    void addMilk(int amount);

    void addBeans(int amount);

    void addCups(int amount);

    int takeMoney();

    MachineState getState();
}
