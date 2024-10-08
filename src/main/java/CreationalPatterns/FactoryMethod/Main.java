package CreationalPatterns.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        // Tạo một nhà máy sản xuất ô tô
        VehicleFactory carFactory = new CarFactory();
        carFactory.goDrive();  // In ra: "Lái xe ô tô"

        // Tạo một nhà máy sản xuất xe máy
        VehicleFactory bikeFactory = new BikeFactory();
        bikeFactory.goDrive();  // In ra: "Lái xe máy"
    }
}
