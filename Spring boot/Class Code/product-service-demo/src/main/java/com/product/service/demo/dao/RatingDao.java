package com.product.service.demo.dao;

import com.product.service.demo.entity.Product;
import com.product.service.demo.entity.Rating;

import java.util.List;

public interface RatingDao {

    List<Rating> findAllRatings();
    Rating findRatingById(Integer id);
    Rating saveRating(Rating rating);
    List<Rating> saveAllRating(List<Rating> listRating, Product id);
    Rating updateRating(Rating rating, Integer id);

}
