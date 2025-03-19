package DataStructural;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop()); // 2 (Lấy phần tử cuối ra)
        System.out.println(stack.peek());
    }
}
