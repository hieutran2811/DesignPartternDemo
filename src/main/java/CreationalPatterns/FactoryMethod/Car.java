package CreationalPatterns.FactoryMethod;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Lái xe ô tô");
    }
}
