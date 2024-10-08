package CreationalPatterns.Prototype;

abstract class Shape implements Prototype{
    String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Implement phương thức clone để sao chép đối tượng
    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public abstract void draw();
}
