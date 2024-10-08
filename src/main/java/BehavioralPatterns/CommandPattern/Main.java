package BehavioralPatterns.CommandPattern;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        // Bật đèn
        remote.setCommand(lightOn);
        remote.pressButton();  // Output: Light is ON

        // Tắt đèn
        remote.setCommand(lightOff);
        remote.pressButton();  // Output: Light is OFF

        // Thao tác hoàn tác
        remote.pressUndo();  // Output: Light is ON
    }
}
