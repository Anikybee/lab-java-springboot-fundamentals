package com.ironhackclass.lab_java_spring_boot_solution.model;


public class Greeting {

        private String message;

        // Constructor
    public Greeting(String message, String name) {
        this.message = message;
    }

    // Getters and Setters
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }


}

