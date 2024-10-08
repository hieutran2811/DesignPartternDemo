package CreationalPatterns.Prototype;

public class Circle extends Shape{
    int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Vẽ hình tròn với bán kính " + radius + " và màu " + color);
    }

    @Override
    public Circle clone() {
        return (Circle) super.clone();
    }
}
