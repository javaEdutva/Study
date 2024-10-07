package com.example.crud.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ErrorResponse runtimeException(RuntimeException e) {
        return new ErrorResponse(e.getMessage(), HttpStatus.NOT_FOUND.value());
    }

    @ExceptionHandler(Exception.class)
    public ErrorResponse exception(Exception e) {
        return new ErrorResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value());
    }

}
