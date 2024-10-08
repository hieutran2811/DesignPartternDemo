package CreationalPatterns.AbstractFactory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Vẽ hộp kiểm kiểu Windows");
    }
}
