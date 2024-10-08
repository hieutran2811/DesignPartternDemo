package BehavioralPatterns.VisitorPattern;

public class AreaCalculator implements ShapeVisitor {
    private double totalArea;

    @Override
    public void visit(Circle circle) {
        totalArea += Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public void visit(Rectangle rectangle) {
        totalArea += rectangle.getWidth() * rectangle.getHeight();
    }

    @Override
    public void visit(Square square) {
        totalArea += square.getSide() * square.getSide();
    }

    public double getTotalArea() {
        return totalArea;
    }
}
