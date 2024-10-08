package BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherSubject {
    private List<WeatherObserver> observers;
    private float temperature;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    // Phương thức để cập nhật dữ liệu thời tiết
    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers(); // Thông báo tất cả observers khi dữ liệu thay đổi
    }
}
