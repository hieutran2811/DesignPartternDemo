package CreationalPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        // Sử dụng builder để tạo đối tượng House
        House house = new House.HouseBuilder()
                .buildFoundation("Concrete")
                .buildStructure("Wood and Brick")
                .buildRoof("Metal")
                .buildGarage(true)
                .buildSwimmingPool(true)
                .buildGarden(false)
                .build();

        System.out.println(house.toString());  // In ra thông tin của ngôi nhà
    }
}
