package com.product.service.demo.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductAlreadyPresentException.class)
    public ErrorResponse exceptionHandler(ProductAlreadyPresentException ex) {
        log.error("Error Message : {} | ProductAlreadyPresentException Class",ex.getMessage());
        return new ErrorResponse(ex.getMessage(), HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(ProductNotFoundException ex) {
        log.error("Error Message : {} | ProductNotFoundException Class",ex.getMessage());
        return new ResponseEntity<>(new ErrorResponse(ex.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse>  exceptionHandler(Exception ex) {
        log.error("Error Message : {} | Exception Class",ex.getMessage());
        return new ResponseEntity<>(new ErrorResponse(ex.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
    }

}
