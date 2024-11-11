package com.product.service.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class FakeStoreCategoriesController {

    // https://fakestoreapi.com/products/categories
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get-all-categories")
    public List<String> getAllCategories() {
        return getCategories();
    }


    private List<String> getCategories() {  // List<String> -> String[]
        // https://fakestoreapi.com/products
        String[] listProduct = restTemplate.getForObject("https://fakestoreapi.com/products/categories", String[].class);
        if(listProduct != null)
            return Arrays.asList(listProduct);

        return null;
    }


}
