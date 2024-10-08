package BehavioralPatterns.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Thanh toán bằng thẻ tín dụng
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100);

        // Thanh toán bằng PayPal
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(150);

        // Thanh toán bằng tiền mặt
        cart.setPaymentStrategy(new CashPayment());
        cart.checkout(200);
    }
}
