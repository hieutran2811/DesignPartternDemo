package BehavioralPatterns.StatePattern;

public class ReadyState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted.");
        vendingMachine.setState(vendingMachine.getCoinInsertedState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin to eject.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Please insert a coin first.");
    }

    @Override
    public void dispense() {
        System.out.println("Insert coin and select product.");
    }
}
