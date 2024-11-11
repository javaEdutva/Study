package com.product.service.demo.controller;

import com.product.service.demo.entity.Product;
import com.product.service.demo.entity.Rating;
import com.product.service.demo.exception.ProductAlreadyPresentException;
import com.product.service.demo.repository.ProductRepository;
import com.product.service.demo.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
public class FakeStoreProductController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RatingRepository ratingRepository;

    @GetMapping("/get-Simple-String")
    public Map<String,String> getSimpleString() {
        Map<String,String> map = new HashMap<>();
        map.put("id","1");
        return map;
    }

    @GetMapping("/get-all-products")
    public List<Product> getAllProducts(@RequestParam(required = false) String category) {
        return getProducts(category);
    }

    private List<Product> getProducts(String category) {
        // https://fakestoreapi.com/products
        Product[] listProduct = null;
        if(category == null || category.isEmpty()) {
            listProduct = restTemplate.getForObject("https://fakestoreapi.com/products", Product[].class);
        } else {
            listProduct = restTemplate.getForObject("https://fakestoreapi.com/products/category/"+category,
                    Product[].class);
        }

        if(listProduct != null)
            return Arrays.asList(listProduct);

        return null;
    }

    @GetMapping("/dp-get-all")
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @GetMapping("/collect-data")
    public Map<String, String> loadDataFromFakeStore() {
        Map<String, String> map = new HashMap<>();

        List<Product> products = getProducts(null);
        List<Product> dbProducts = getAll();

        if(dbProducts != null && !dbProducts.isEmpty()) {
            throw new ProductAlreadyPresentException();
        }

        saveAllProductData(products);

        map.put("message", "Data Loaded in DB");

        return map;
    }

    private void saveAllProductData(List<Product> products) {

        for(Product product : products) {
            List<Rating> tempRating = new ArrayList<>();
            tempRating.add(product.getRating());

            product = productRepository.save(product);

            tempRating.get(0).setProduct(product);

            ratingRepository.saveAll(tempRating);
        }

    }


}
