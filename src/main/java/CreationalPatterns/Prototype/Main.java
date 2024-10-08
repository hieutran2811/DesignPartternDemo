package CreationalPatterns.Prototype;

public class Main {
    public static void main(String[] args) {
        // Tạo hình gốc (prototype)
        Circle circle1 = new Circle("Đỏ", 10);
        circle1.draw();  // In ra: "Vẽ hình tròn với bán kính 10 và màu Đỏ"

        // Tạo một bản sao của hình tròn
        Circle circle2 = circle1.clone();
        circle2.draw();  // In ra: "Vẽ hình tròn với bán kính 10 và màu Đỏ"

        // Tạo hình chữ nhật gốc (prototype)
        Rectangle rect1 = new Rectangle("Xanh", 20, 30);
        rect1.draw();  // In ra: "Vẽ hình chữ nhật với chiều rộng 20, chiều cao 30 và màu Xanh"

        // Sao chép hình chữ nhật
        Rectangle rect2 = rect1.clone();
        rect2.draw();  // In ra: "Vẽ hình chữ nhật với chiều rộng 20, chiều cao 30 và màu Xanh"
    }
}
