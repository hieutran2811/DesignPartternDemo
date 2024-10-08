package CreationalPatterns.FactoryMethod;

public abstract class VehicleFactory {
    // Phương thức tạo ra đối tượng - phương thức này sẽ được các lớp con định nghĩa
    public abstract Vehicle createVehicle();

    // Một phương thức khác có thể sử dụng đối tượng đã tạo
    public void goDrive() {
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}
