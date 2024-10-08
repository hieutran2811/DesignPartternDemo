package BehavioralPatterns.StatePattern;

public interface VendingMachineState {
    void insertCoin();
    void ejectCoin();
    void selectProduct();
    void dispense();
}
