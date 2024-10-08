package StructuralPatterns.FacadePattern;

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector);
        homeTheater.watchMovie("Inception");  // Thực hiện tất cả các bước cần thiết để xem phim
    }
}
