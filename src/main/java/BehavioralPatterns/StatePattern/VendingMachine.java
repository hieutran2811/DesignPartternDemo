package BehavioralPatterns.StatePattern;

public class VendingMachine {
    private VendingMachineState readyState;
    private VendingMachineState coinInsertedState;
    private VendingMachineState dispensingState;

    private VendingMachineState currentState;

    public VendingMachine() {
        readyState = new ReadyState(this);
        coinInsertedState = new CoinInsertedState(this);
        dispensingState = new DispensingState(this);

        currentState = readyState; // Bắt đầu ở trạng thái sẵn sàng
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getReadyState() {
        return readyState;
    }

    public VendingMachineState getCoinInsertedState() {
        return coinInsertedState;
    }

    public VendingMachineState getDispensingState() {
        return dispensingState;
    }

    // Phương thức để tương tác với máy
    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void selectProduct() {
        currentState.selectProduct();
        currentState.dispense(); // Gọi để phát sản phẩm
    }
}
