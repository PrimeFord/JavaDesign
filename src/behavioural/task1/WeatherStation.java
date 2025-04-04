package behavioural.task1;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

    }

    public void notifyObservers(float temperature, float humidity, float pressure) {
//        float temperature, float humidity, float pressure
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

}
