package com.ironhackclass.lab_java_spring_boot_solution.service;


import org.springframework.stereotype.Service;

import java.util.Random;


@Service
public class WeatherService {
    private final Random random = new Random();

    //Temperature from -10 to 40
    public int currentTemperature(){
        return random.nextInt(51) - 10;
        }

    //Weather Condition
    public String currentWeatherCondition() {
        String[] conditions = {"Sunny", "Rainy", "Cloudy", "Windy"};
        return conditions[random.nextInt(conditions.length)];
    }

    public int currentWindSpeed(){
        return random.nextInt(101);
    }
}



