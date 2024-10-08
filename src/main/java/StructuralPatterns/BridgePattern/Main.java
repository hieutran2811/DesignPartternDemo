package StructuralPatterns.BridgePattern;

public class Main {
    public static void main(String[] args) {
        Renderer computerRenderer = new ComputerRenderer();
        Renderer phoneRenderer = new PhoneRenderer();

        Shape circle = new Circle(computerRenderer, 5);
        circle.draw();  // Rendering circle with radius 5 on computer.

        Shape circleOnPhone = new Circle(phoneRenderer, 5);
        circleOnPhone.draw();  // Rendering circle with radius 5 on phone.
    }
}
