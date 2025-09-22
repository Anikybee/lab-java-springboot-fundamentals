package com.ironhackclass.lab_java_spring_boot_solution.model;

public class TimeInfo {
    private String time;
    private String date;
    private String day;

    public TimeInfo(String time, String date, String day) {
        this.time = time;
        this.date = date;
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
