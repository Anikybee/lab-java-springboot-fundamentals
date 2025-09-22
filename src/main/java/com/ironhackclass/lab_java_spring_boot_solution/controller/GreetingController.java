package com.ironhackclass.lab_java_spring_boot_solution.controller;

import com.ironhackclass.lab_java_spring_boot_solution.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class GreetingController {

    // Constructor Injection
    @Autowired
    private final GreetingService greetingService;


    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String greet() {
        return greetingService.greet();
    }

//    // http://localhost:8080/hello/Bee
    @GetMapping("/hello/{name}")
    public String greetWithName(@PathVariable String name) {
        return ("Hello " + name + "!");
    }
//
    //http://localhost:8080/add/10/20
    @GetMapping("/add/{num1}/{num2}")
    public String addNumbers(@PathVariable int num1, @PathVariable int num2) {
        return greetingService.addNumbers(num1, num2);
    }
//
    //http://localhost:8080/multiply/10/20
    @GetMapping("/multiply/{num1}/{num2}")
    public String multiplyNumbers(@PathVariable int num1, @PathVariable int num2) {
        return greetingService.multiplyNumbers(num1, num2);
    }
}