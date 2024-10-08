package CreationalPatterns.AbstractFactory;

public class MacOSCheckBox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Vẽ hộp kiểm kiểu macOS");
    }
}
