package StructuralPatterns.DecoratorPattern;

public class ItalicTextDecorator extends TextDecorator {
    public ItalicTextDecorator(Text text) {
        super(text);
    }

    public String render() {
        return "<i>" + text.render() + "</i>";
    }
}
