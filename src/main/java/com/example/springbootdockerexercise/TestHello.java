package com.example.springbootdockerexercise;

import org.springframework.boot.SpringApplication;

public class TestHello {
    String home(){
        return "Hello!";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestHello.class, args);
    }
}
