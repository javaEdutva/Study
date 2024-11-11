package com.product.service.demo.controller;


import com.product.service.demo.entity.Product;
import com.product.service.demo.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    // Create Read Update Delete

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.findAll();
    }
    @GetMapping(params = "id")
    public Product findById(@RequestParam(name = "id") Integer id) {
        return productService.findById(id);
    }

    @PostMapping
    public Product save(@Valid @RequestBody Product product) {
        return productService.save(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product, @RequestParam Integer id) {
        return productService.update(product, id);
    }

    @DeleteMapping
    public String delete(@RequestParam Integer id) {
        productService.delete(id);
        return "Product deleted";
    }


}
