package com.product.service.demo.dao;

import com.product.service.demo.entity.Product;
import com.product.service.demo.entity.Rating;
import com.product.service.demo.exception.RatingNotFoundException;
import com.product.service.demo.repository.RatingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RatingDaoImpl implements RatingDao{

    private final RatingRepository ratingRepository;

    public RatingDaoImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @Override
    public List<Rating> findAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public Rating findRatingById(Integer id) {
        return ratingRepository.findById(id)
                .orElseThrow(RatingNotFoundException::new);
    }

    @Override
    public Rating saveRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> saveAllRating(List<Rating> listRating, Product product) {
//        List<Rating> savedRatings = new ArrayList<>();
//
//        for(Rating rating : listRating){
//            rating.setProduct(product);
//            savedRatings.add(saveRating(rating));
//        }
//
//        return savedRatings;

        return ratingRepository.saveAll(listRating);
    }

    @Override
    public Rating updateRating(Rating rating, Integer id) {

        Rating existingObj = findRatingById(id);

        existingObj.setRate(rating.getRate());
        existingObj.setCount(rating.getCount());

        return ratingRepository.save(existingObj);
    }
}
