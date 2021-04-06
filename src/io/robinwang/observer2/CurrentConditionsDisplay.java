package io.robinwang.observer2;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    //  观察者利用主题的接口向主题注册，达到松耦合
    public CurrentConditionsDisplay(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current ConditionsD:"+temperature+"F degrees and "+humidity+ "% humidity");
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData) obs;
            this.temperature=weatherData.getTemperature();
            this.humidity= weatherData.getHumidity();
            display();
        }
    }
}
