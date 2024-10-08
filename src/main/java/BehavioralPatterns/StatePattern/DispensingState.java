package BehavioralPatterns.StatePattern;

public class DispensingState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, dispensing product.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Cannot eject coin now, product is being dispensed.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Already dispensing a product.");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensing product.");
        // Sau khi hoàn thành việc phát sản phẩm, quay về trạng thái sẵn sàng
        vendingMachine.setState(vendingMachine.getReadyState());
    }
}
