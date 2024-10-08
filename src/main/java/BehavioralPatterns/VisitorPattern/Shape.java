package BehavioralPatterns.VisitorPattern;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
