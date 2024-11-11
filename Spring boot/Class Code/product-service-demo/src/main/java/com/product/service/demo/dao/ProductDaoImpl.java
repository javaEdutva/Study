package com.product.service.demo.dao;

import com.product.service.demo.entity.Product;
import com.product.service.demo.exception.ProductNotFoundException;
import com.product.service.demo.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.product.service.demo.util.CommonUtil.ACTIVE_TYPE;


@Repository
public class ProductDaoImpl implements ProductDao {

    private final ProductRepository productRepository;
    private final RatingDao ratingDao;

    public ProductDaoImpl(ProductRepository productRepository, RatingDao ratingDao) {
        this.productRepository = productRepository;
        this.ratingDao = ratingDao;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findByActive(ACTIVE_TYPE);
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findByIdAndActive(id, ACTIVE_TYPE)
                .orElseThrow(ProductNotFoundException::new);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
//        List<Rating> ratings = ratingDao.saveAllRating(product.getProductRating(), saveProduct);
//        saveProduct.setProductRating(ratings);
//        return saveProduct;
    }

    @Override
    public Product update(Product product, Integer id) {

        if(!productRepository.existsByIdAndActive(id, ACTIVE_TYPE)) {
            throw new ProductNotFoundException("Product is not active");
        }

        Product existingProduct = findById(id);

        existingProduct.setCategory(product.getCategory());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setImage(product.getImage());
        existingProduct.setTitle(product.getTitle());
        existingProduct.setDescription(product.getDescription());


        return productRepository.save(existingProduct);
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        productRepository.deleteById(id);
    }

    @Override
    public boolean existsByEmail(String email) {
        return productRepository.existsByEmail(email);
    }

}
