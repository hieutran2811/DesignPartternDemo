package CreationalPatterns.AbstractFactory;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Vẽ nút kiểu Windows");
    }
}
