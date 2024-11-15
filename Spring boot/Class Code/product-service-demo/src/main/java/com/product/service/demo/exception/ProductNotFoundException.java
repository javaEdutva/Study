package com.product.service.demo.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException() {
        super("Product Not Found Exception");
    }

    public ProductNotFoundException(String message) {
        super(message);
    }

}
