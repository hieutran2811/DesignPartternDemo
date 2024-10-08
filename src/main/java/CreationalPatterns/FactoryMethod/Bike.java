package CreationalPatterns.FactoryMethod;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Lái xe máy");
    }
}
