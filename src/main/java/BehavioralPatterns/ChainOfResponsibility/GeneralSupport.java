package BehavioralPatterns.ChainOfResponsibility;

class GeneralSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("general")) {
            System.out.println("General Support handling the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
