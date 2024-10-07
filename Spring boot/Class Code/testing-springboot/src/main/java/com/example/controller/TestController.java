package com.example.controller;

import com.example.entity.dto.UserRequest;
import com.example.service.TestService_B;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService_B testServiceB;

    public TestController(TestService_B testServiceB) {
        this.testServiceB = testServiceB;
    }

    @GetMapping
    public String getClassName() {
        return testServiceB.testFieldA();
    }

    @GetMapping(params = "name")
    public String getClassName(@RequestParam String name) {
        System.out.println("getClassName: " + name);
        return name;
    }

    @GetMapping("/{name}")
    public String getPathValue(@PathVariable String name) {
        System.out.println("getPathValue: " + name);
        return name;
    }

    @GetMapping("/{firstName}/{lastName}")
    public String getPathValue(@PathVariable String firstName, @PathVariable String lastName) {
        System.out.println("getPathValue: " + firstName + " " + lastName);
        return firstName + " " + lastName;
    }

    @PostMapping
    public UserRequest createUser(@RequestBody UserRequest userRequest) {
        System.out.println(userRequest);
        return userRequest;
    }

}
