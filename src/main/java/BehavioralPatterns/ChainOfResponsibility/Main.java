package BehavioralPatterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler techSupport = new TechnicalSupport();
        SupportHandler billingSupport = new BillingSupport();
        SupportHandler generalSupport = new GeneralSupport();

        // Thiết lập chuỗi xử lý
        techSupport.setNextHandler(billingSupport);
        billingSupport.setNextHandler(generalSupport);

        // Gửi các yêu cầu
        System.out.println("Request: Technical");
        techSupport.handleRequest("technical");

        System.out.println("\nRequest: Billing");
        techSupport.handleRequest("billing");

        System.out.println("\nRequest: General");
        techSupport.handleRequest("general");

        System.out.println("\nRequest: Unknown");
        techSupport.handleRequest("unknown");  // Không ai xử lý yêu cầu
    }
}
