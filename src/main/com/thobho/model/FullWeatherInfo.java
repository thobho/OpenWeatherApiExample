package com.thobho.model;

import java.util.Objects;

public class FullWeatherInfo {


    private MainWeatherInfo main;
    private int visibility;
    private Wind wind;


    public int getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public MainWeatherInfo getMain() {
        return main;
    }

    public void setMain(MainWeatherInfo main) {
        this.main = main;
    }


    @Override
    public String toString() {
        return "FullWeatherInfo{" +
                "main=" + main +
                '}';
    }
}
