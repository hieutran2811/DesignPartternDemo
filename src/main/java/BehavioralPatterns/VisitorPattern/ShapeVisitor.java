package BehavioralPatterns.VisitorPattern;

public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Square square);
}
