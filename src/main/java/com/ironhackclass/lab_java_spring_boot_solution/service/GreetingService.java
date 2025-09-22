package com.ironhackclass.lab_java_spring_boot_solution.service;



    import com.ironhackclass.lab_java_spring_boot_solution.model.Greeting;
    import org.springframework.stereotype.Service;


@Service
public class GreetingService {

    public String greet() {
        Greeting greeting = new Greeting("Hello World", null);
        return greeting.getMessage();
    }

//
    public String addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return "Sum: " +  sum;
    }

    public String multiplyNumbers(int num1, int num2) {
        int product = num1 * num2;
        return "Product: " +  product;
    }
}

