package StructuralPatterns.BridgePattern;

public class ComputerRenderer implements Renderer {
    public void renderCircle(float radius) {
        System.out.println("Rendering circle with radius " + radius + " on computer.");
    }
}
