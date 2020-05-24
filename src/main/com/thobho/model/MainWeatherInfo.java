package com.thobho.model;

public class MainWeatherInfo {

       private double temp;
       private int pressure;
       private int humidity;

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "MainWeatherInfo{" +
                "temp=" + temp +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}
