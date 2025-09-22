package com.ironhackclass.lab_java_spring_boot_solution.service;

import com.ironhackclass.lab_java_spring_boot_solution.model.TimeInfo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class TimeService {
    public String currentTime(){
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public String currentDate(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public String currentDay(){
        return LocalDate.now().getDayOfWeek().toString();
    }

    public TimeInfo AllTimeInfo(){
        return new TimeInfo(
                currentTime(),
                currentDay(),
                currentDate()

        );
    }
}
