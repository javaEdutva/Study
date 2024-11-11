package com.product.service.demo.service;

import com.product.service.demo.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(Integer id);

    Product save(Product product);

    Product update(Product product, Integer id);

    void delete(Integer id);

}
