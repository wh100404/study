package com.example.springboot.design.observer.java;


public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasureChanges(80,65,30.4F);
        weatherData.setMeasureChanges(82,70,29.2F);
        weatherData.setMeasureChanges(78,90,29.2F);
    }
}
