package io.robinwang.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList observes;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observes = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
       this.observes.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observes.indexOf(o);
        if (i >= 0) {
            observes.remove(i);
        }
    }

    //主题利用观察者接口通知观察者->松耦合
    @Override
    public void notifyObserver() {
        for (int i=0;i<observes.size();i++) {
            Observer observer = (Observer) observes.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    //  更新通知观察者
    public  void measurementsChanged()  {
        notifyObserver();
    }
    public void setMeasurements(float temperature, float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
