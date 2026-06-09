package com.github.gopalakrrish.springstore.api.carts;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItemDto {
    private ProductDto product;
    private Integer quantity;
    private BigDecimal totalPrice;
}
