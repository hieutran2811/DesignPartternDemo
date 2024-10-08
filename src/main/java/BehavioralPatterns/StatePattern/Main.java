package BehavioralPatterns.StatePattern;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin(); // Chèn tiền
        vendingMachine.selectProduct(); // Chọn sản phẩm

        vendingMachine.ejectCoin(); // Thử trả tiền (không thể khi đang phát sản phẩm)
        vendingMachine.insertCoin(); // Chèn tiền một lần nữa
        vendingMachine.selectProduct(); // Chọn sản phẩm
    }
}
