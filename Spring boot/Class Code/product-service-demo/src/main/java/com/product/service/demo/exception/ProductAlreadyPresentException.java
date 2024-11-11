package com.product.service.demo.exception;

public class ProductAlreadyPresentException extends RuntimeException {

    public ProductAlreadyPresentException() {
        super("Product already exists");
    }

    public ProductAlreadyPresentException(String message) {
        super(message);
    }

}
