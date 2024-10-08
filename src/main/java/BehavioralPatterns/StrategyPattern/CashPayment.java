package BehavioralPatterns.StrategyPattern;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Cash.");
    }
}
