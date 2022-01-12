package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String locationWeatherInfo() {
        double newTemp = getTempInFahrenheit();
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, weatherLocation(), temp(), newTemp);

    }

    public String weatherLocation() {
        if (location == "London") {

            return "🌦";

        } else if (location == "California") {

            return "🌅";

        } else if (location == "Cape Town") {

            return "🌤";

        }
        return "🔆";
    }

    public String temp() {

        int tempRange1 = 30;
        int tempRange2 = 10;

        if (temperature > tempRange1) {

            return "It's too hot 🥵!";

        } else if (temperature < tempRange2) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }


    private double getTempInFahrenheit(){
        return (9.0 / 5.0) * temperature + 32;
    }

}