package com.product.service.demo.repository;

import com.product.service.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    boolean existsByEmail(String email);

    Optional<Product> findByIdAndActive(Integer id, char t);

    List<Product> findByActive(char value);

    boolean existsByIdAndActive(Integer id, char t);
}
