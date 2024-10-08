package BehavioralPatterns.VisitorPattern;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5),
                new Rectangle(4, 6),
                new Square(3)
        };

        AreaCalculator areaCalculator = new AreaCalculator();

        for (Shape shape : shapes) {
            shape.accept(areaCalculator); // Tính toán diện tích cho từng hình
        }

        System.out.println("Total Area: " + areaCalculator.getTotalArea());
    }
}
