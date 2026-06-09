package com.github.gopalakrrish.springstore.api.carts;

public class CartNotFoundException extends RuntimeException{
    public CartNotFoundException() {
        super("Cart not found");
    }
}
