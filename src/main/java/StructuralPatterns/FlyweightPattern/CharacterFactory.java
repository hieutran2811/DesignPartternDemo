package StructuralPatterns.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<String, Character> characters = new HashMap<>();

    public static Character getCharacter(String type) {
        Character character = characters.get(type);
        if (character == null) {
            switch (type) {
                case "Warrior":
                    character = new Warrior();
                    break;
                case "Mage":
                    character = new Mage();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown character type.");
            }
            characters.put(type, character); // Lưu trữ đối tượng vào bản đồ
        }
        return character;
    }
}
