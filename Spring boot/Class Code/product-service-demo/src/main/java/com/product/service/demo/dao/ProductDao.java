package com.product.service.demo.dao;

import com.product.service.demo.entity.Product;

import java.util.List;

public interface ProductDao {

    List<Product> findAll();

    Product findById(Integer id);

    Product save(Product product);

    Product update(Product product, Integer id);

    void delete(Integer id);

    boolean existsByEmail(String email);


}
