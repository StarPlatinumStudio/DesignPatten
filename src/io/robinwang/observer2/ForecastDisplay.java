package io.robinwang.observer2;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement {
    private float currentPressure=29.92f;
    private float lastPressure;
    private Observable observable;
    public ForecastDisplay(Observable observable) {
    observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Pressure:"+currentPressure+" and last Pressure:"+lastPressure);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData) obs;
            lastPressure=currentPressure;
            currentPressure= weatherData.getPressure();
            display();
        }
    }
}
