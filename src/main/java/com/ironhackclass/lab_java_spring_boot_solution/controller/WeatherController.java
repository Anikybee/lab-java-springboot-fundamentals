package com.ironhackclass.lab_java_spring_boot_solution.controller;

import com.ironhackclass.lab_java_spring_boot_solution.model.Weather;
import com.ironhackclass.lab_java_spring_boot_solution.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


    public class WeatherController {

        private final WeatherService weatherService;

        public WeatherController(WeatherService weatherService) {
            this.weatherService = weatherService;
        }


        // http://localhost:8080/weather/All
        @GetMapping("/weather/All")
         public Weather weatherCondition() {
            int temp = weatherService.currentTemperature();
            String condition = weatherService.currentWeatherCondition();
            int wind = weatherService.currentWindSpeed();

            return new Weather(temp, condition, wind);
        }

        // http://localhost:8080/weather
        @GetMapping("/weather/condition")
        public String condition (){
            return weatherService.currentWeatherCondition();
        }

        // http://localhost:8080/weather/temp
        @GetMapping("/weather/temp")
        public int temp () {
            return weatherService.currentTemperature();
        }

        // http://localhost:8080/weather/temp
        @GetMapping("/weather/wind")
        public int wind () {
            return weatherService.currentWindSpeed();
    }


    }


