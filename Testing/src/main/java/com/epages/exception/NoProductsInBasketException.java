package com.epages.exception;

public class NoProductsInBasketException extends Exception {

    private static final long serialVersionUID = 1L;

    public NoProductsInBasketException(String message) {
        super(message);
    }
}
