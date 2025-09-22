package com.ironhackclass.lab_java_spring_boot_solution.controller;

import com.ironhackclass.lab_java_spring_boot_solution.model.TimeInfo;
import com.ironhackclass.lab_java_spring_boot_solution.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService){
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String getTime() {
        return timeService.currentTime();
    }

    // GET /date
    // http://localhost:8080/date
    @GetMapping("/date")
    public String getDate() {
        return timeService.currentDate();
    }

    // GET /day
    // http://localhost:8080/day
    @GetMapping("/day")
    public String getDay() {
        return timeService.currentDay();
    }

    // GET /all
    // http://localhost:8080/all
    @GetMapping("/all")
    public TimeInfo getAllInfo() {
        return timeService.AllTimeInfo();
    }

}
