package BehavioralPatterns.InterpreterPattern;

import java.util.Map;

public class Subtraction implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public Subtraction(Expression left, Expression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return leftExpression.interpret(context) - rightExpression.interpret(context);
    }
}
