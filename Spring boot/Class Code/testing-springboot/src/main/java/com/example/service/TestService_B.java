package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService_B {

    // field injection
    @Autowired
    private TestService_A testServiceA;

    public TestService_B() {
        System.out.println("TestService_B class object");
    }

    public String testFieldA() {
        return testServiceA.getClassName();
    }


}
