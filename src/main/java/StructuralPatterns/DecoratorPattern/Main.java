package StructuralPatterns.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Text text = new PlainText("Hello, world!");

        // Thêm in đậm và in nghiêng
        text = new BoldTextDecorator(text);
        text = new ItalicTextDecorator(text);

        System.out.println(text.render());  // Output: <i><b>Hello, world!</b></i>
    }
}
