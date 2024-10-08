package StructuralPatterns.FlyweightPattern;

public class Mage implements Character {
    private final String type;

    public Mage() {
        this.type = "Mage";
    }

    @Override
    public void display(String color) {
        System.out.println("Displaying " + color + " " + type);
    }
}
