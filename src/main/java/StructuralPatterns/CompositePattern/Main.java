package StructuralPatterns.CompositePattern;

public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng đơn giản
        Circle circle = new Circle();
        Square square = new Square();

        // Tạo composite để chứa các đối tượng đơn giản
        CompositeGraphic composite = new CompositeGraphic();
        composite.add(circle);
        composite.add(square);

        // Vẽ tất cả các thành phần trong composite
        composite.draw();  // Output: Drawing a circle. Drawing a square.
    }
}
