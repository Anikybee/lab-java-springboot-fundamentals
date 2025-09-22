package com.ironhackclass.lab_java_spring_boot_solution.model;

public class Weather {

    private int temperature;
    private String condition;
    private int windspeed;

    public Weather(int temperature, String condition, int windspeed) {
        this.temperature = temperature;
        this.condition = condition;
        this.windspeed = windspeed;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(int windspeed) {
        this.windspeed = windspeed;
    }
}
