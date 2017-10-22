package observer.model;

import observer.interfaces.Observer;

public class WheterObserver implements Observer {


    private WheaterData wheaterData;

    private double temperature;
    private double pressure;
    private double humidity;

    public WheterObserver(WheaterData wheaterData) {
        this.wheaterData = wheaterData;
        wheaterData.addObserver(this);
    }

    public void update() {
        updateData();
        System.out.println("I have been updated with values: ");
        System.out.println("humidity: " + wheaterData.getHumidity());
        System.out.println("pressure: " + wheaterData.getPressure());
        System.out.println("temperature: " + wheaterData.getTemperature());
    }

    private void updateData() {
        this.temperature = wheaterData.getTemperature();
        this.pressure = wheaterData.getPressure();
        this.humidity = wheaterData.getHumidity();
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
