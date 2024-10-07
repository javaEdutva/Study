package com.example.service;


import org.springframework.stereotype.Component;

@Component
public class TestService_A {

    public TestService_A() {
        System.out.println("TestService_A class object");
    }

    public String getClassName() {
        return "Current class TestService_A";
    }

}
