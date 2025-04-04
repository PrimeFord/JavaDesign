package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class NewPublisher implements Subject{
    private List<Observer> observers = new ArrayList<>();

//    @Override #Unless you using polymorphism
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
