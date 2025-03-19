package BehavioralPatterns.VisitorPattern;

public class PerimeterCalculator implements ShapeVisitor {
    private double perimeter;

    @Override
    public void visit(Circle circle) {
        perimeter += 2 * Math.PI * circle.getRadius();
    }

    @Override
    public void visit(Rectangle rectangle) {
        perimeter += 2 * (rectangle.getHeight() + rectangle.getWidth());
    }

    @Override
    public void visit(Square square) {
        perimeter += 4 * square.getSide();
    }

    public double getPerimeter() {
        return perimeter;
    }
}
