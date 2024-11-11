package com.product.service.demo.service;


import com.product.service.demo.dao.ProductDao;
import com.product.service.demo.entity.Product;
import com.product.service.demo.exception.ObjectValidationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return productDao.findById(id);
    }

    @Override
    public Product save(Product product) {
        productObjectValidation(product);
        return productDao.save(product);
    }

    @Override
    public Product update(Product product, Integer id) {
        productObjectValidation(product);
        return productDao.update(product, id);
    }

    @Override
    public void delete(Integer id) {
        productDao.delete(id);
    }

//    -------------- Object validation -------------------
    public void productObjectValidation(Product product) {

        if(product.getTitle() == null || product.getTitle().isBlank())
            throw new ObjectValidationException("Title is blank");

        if(product.getPrice() == null)
            throw new ObjectValidationException("Price is null");

        if(product.getCategory() == null || product.getCategory().isBlank())
            throw new ObjectValidationException("Category is null");

        if(product.getImage() == null || product.getImage().isBlank())
            throw new ObjectValidationException("Image is blank");

        if(product.getEmail() == null)
            throw new ObjectValidationException("Email can't be null");

        if(productDao.existsByEmail(product.getEmail()))
            throw new ObjectValidationException("Email already exists");

    }


}
