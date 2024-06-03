package com.example.catsdatabase;

public class CatNotFoundException extends RuntimeException {

    public CatNotFoundException(String message) {
        super(message);
    }
}
