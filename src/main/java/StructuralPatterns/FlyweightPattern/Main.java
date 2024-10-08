package StructuralPatterns.FlyweightPattern;

public class Main {
    public static void main(String[] args) {
        Character warrior1 = CharacterFactory.getCharacter("Warrior");
        warrior1.display("Red");

        Character warrior2 = CharacterFactory.getCharacter("Warrior");
        warrior2.display("Blue");

        Character mage1 = CharacterFactory.getCharacter("Mage");
        mage1.display("Green");

        // Kiểm tra xem warrior1 và warrior2 có phải là cùng một đối tượng không
        System.out.println("warrior1 == warrior2: " + (warrior1 == warrior2)); // true
    }
}
