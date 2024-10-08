package CreationalPatterns.FactoryMethod;

public class BikeFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Bike();  // Trả về một đối tượng Bike
    }
}
