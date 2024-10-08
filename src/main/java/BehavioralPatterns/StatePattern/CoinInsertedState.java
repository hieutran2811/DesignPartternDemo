package BehavioralPatterns.StatePattern;

public class CoinInsertedState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public CoinInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin returned.");
        vendingMachine.setState(vendingMachine.getReadyState());
    }

    @Override
    public void selectProduct() {
        System.out.println("Product selected.");
        vendingMachine.setState(vendingMachine.getDispensingState());
    }

    @Override
    public void dispense() {
        System.out.println("Please select a product first.");
    }
}
