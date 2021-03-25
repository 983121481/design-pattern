package com.tmin.observer;

/**
 * @author
 * @date 2021-02-22 22:15
 */
public class CurrentConditions implements Observer {

    //温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新 天气情况，是由WeatherData来调用，使用推送模式

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    private void display() {
        System.out.println("***Today mTemperature:"+temperature+"***");
        System.out.println("***Today mpressure:"+pressure+"***");
        System.out.println("***Today mhumidity:"+humidity+"***");
    }

}
