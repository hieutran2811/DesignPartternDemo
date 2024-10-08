package CreationalPatterns.Prototype;

public class Rectangle extends Shape{
    int width, height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Vẽ hình chữ nhật với chiều rộng " + width + ", chiều cao " + height + " và màu " + color);
    }

    @Override
    public Rectangle clone() {
        return (Rectangle) super.clone();
    }
}
