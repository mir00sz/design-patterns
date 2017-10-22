package observer.model;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WheaterData implements Subject {

    private List<Observer> observers;
    private double temperature;
    private double pressure;
    private double humidity;

    public WheaterData() {
        this.observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update();
        }
    }

    public void setValues(double temperature, double humidity, double pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }
}
