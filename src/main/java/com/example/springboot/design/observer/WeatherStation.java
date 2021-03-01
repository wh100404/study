package com.example.springboot.design.observer;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4F);
        weatherData.setMeasurements(82,70,29.2F);
        weatherData.setMeasurements(78,90,29.2F);
    }
}
