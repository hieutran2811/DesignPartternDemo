package BehavioralPatterns.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        weatherData.registerObserver(currentDisplay); // Đăng ký observer

        // Cập nhật dữ liệu thời tiết
        weatherData.setMeasurements(25.5f, 65.0f);
        weatherData.setMeasurements(27.0f, 70.0f);
    }
}
