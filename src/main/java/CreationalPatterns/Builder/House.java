package CreationalPatterns.Builder;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    // Constructor private để ngăn không cho khởi tạo đối tượng trực tiếp
    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
    }

    @Override
    public String toString() {
        return "House with foundation: " + foundation +
                ", structure: " + structure +
                ", roof: " + roof +
                ", garage: " + hasGarage +
                ", swimming pool: " + hasSwimmingPool +
                ", garden: " + hasGarden;
    }

    // Builder class
    public static class HouseBuilder {
        private String foundation;
        private String structure;
        private String roof;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        // Các phương thức để xây dựng từng phần của đối tượng
        public HouseBuilder buildFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public HouseBuilder buildStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public HouseBuilder buildRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder buildGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder buildSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder buildGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        // Phương thức cuối cùng để tạo đối tượng House
        public House build() {
            return new House(this);
        }
    }
}
