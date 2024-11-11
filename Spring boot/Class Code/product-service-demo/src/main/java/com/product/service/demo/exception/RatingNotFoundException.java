package com.product.service.demo.exception;

public class RatingNotFoundException extends RuntimeException {

    public RatingNotFoundException() {
        super("Rating Not Found");
    }

    public RatingNotFoundException(String message) {
        super(message);
    }

}
