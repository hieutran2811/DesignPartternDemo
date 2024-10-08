package BehavioralPatterns.InterpreterPattern;

import java.util.Map;

public interface Expression {
    int interpret(Map<String, Integer> context);
}
