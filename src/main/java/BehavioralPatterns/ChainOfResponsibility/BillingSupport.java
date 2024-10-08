package BehavioralPatterns.ChainOfResponsibility;

class BillingSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("billing")) {
            System.out.println("Billing Support handling the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
