package StructuralPatterns.DecoratorPattern;

public class BoldTextDecorator extends TextDecorator {
    public BoldTextDecorator(Text text) {
        super(text);
    }

    public String render() {
        return "<b>" + text.render() + "</b>";
    }
}
