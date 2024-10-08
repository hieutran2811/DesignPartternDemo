package CreationalPatterns.FactoryMethod;

public class CarFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();  // Trả về một đối tượng Car
    }
}
