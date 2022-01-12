package com.techreturners.encapsulation.bankaccount.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WeatherReporterTest {

    @Test
    public void checkWeather(){
        WeatherReporter weatherReporter = new WeatherReporter("London", 34);
        String expected = "I am in London and it is \uD83C\uDF26. It's too hot \uD83E\uDD75!. The temperature in Fahrenheit is 93.2.";
        assertEquals(expected, weatherReporter.locationWeatherInfo());
    }

    @Test
    public void checkTemp(){
        WeatherReporter weatherReporter = new WeatherReporter("London", 34);
        String expected = "It's too hot \uD83E\uDD75!";
        assertEquals(expected, weatherReporter.temp());
    }

    @Test
    public void checkLocation(){
        WeatherReporter weatherReporter = new WeatherReporter("London", 34);
        String expected = "\uD83C\uDF26";
        assertEquals(expected, weatherReporter.weatherLocation());
    }

}
