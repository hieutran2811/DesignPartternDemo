package BehavioralPatterns.CommandPattern;

public class Light {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Light is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is OFF");
    }

    public void increaseBrightness() {
        System.out.println("Increasing brightness");
    }

    public void decreaseBrightness() {
        System.out.println("Decreasing brightness");
    }
}
