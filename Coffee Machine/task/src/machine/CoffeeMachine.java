package machine;

public class CoffeeMachine {
    public static void main(String[] args) {
        UI ui = new ConsoleUI(new ConsoleContext(System.out, System.in));
        CoffeeMachineAPI machine = new CoffeeMachineImpl(400, 540, 120, 9, 550);
        CoffeeMachineRunner runner = new CoffeeMachineRunner(machine, ui);
        runner.addActions(
                Action.BUY,
                Action.FILL,
                Action.TAKE,
                Action.REMAINING);
        runner.run();
    }
}