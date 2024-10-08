package StructuralPatterns.FlyweightPattern;

public class Warrior implements Character{
    private final String type;

    public Warrior() {
        this.type = "Warrior";
    }

    @Override
    public void display(String color) {
        System.out.println("Displaying " + color + " " + type);
    }
}
