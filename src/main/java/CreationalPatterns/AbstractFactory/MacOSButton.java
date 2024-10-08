package CreationalPatterns.AbstractFactory;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("Vẽ nút kiểu macOS");
    }
}
