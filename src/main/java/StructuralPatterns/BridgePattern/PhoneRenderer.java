package StructuralPatterns.BridgePattern;

public class PhoneRenderer implements Renderer {
    public void renderCircle(float radius) {
        System.out.println("Rendering circle with radius " + radius + " on phone.");
    }
}
