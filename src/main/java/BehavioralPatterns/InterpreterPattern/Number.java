package BehavioralPatterns.InterpreterPattern;

import java.util.Map;

public class Number implements Expression {
    private final int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return number;
    }
}
