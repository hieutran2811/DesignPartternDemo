package BehavioralPatterns.InterpreterPattern;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Biểu thức: (5 + 10) - 3
        Expression expression = new Subtraction(new Addition(new Number(5), new Number(10)), new Number(3));

        // Ngữ cảnh không cần thiết cho biểu thức số học đơn giản này
        Map<String, Integer> context = new HashMap<>();

        // Diễn giải và tính toán kết quả
        int result = expression.interpret(context);
        System.out.println("Result: " + result);  // Output: Result: 12
    }
}
