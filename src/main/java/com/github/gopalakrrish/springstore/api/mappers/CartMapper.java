package com.github.gopalakrrish.springstore.api.mappers;

import com.github.gopalakrrish.springstore.api.dtos.CartDto;
import com.github.gopalakrrish.springstore.api.dtos.CartItemDto;
import com.github.gopalakrrish.springstore.api.entities.Cart;
import com.github.gopalakrrish.springstore.api.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto toDto(Cart cart);

    @Mapping(source = "quantity", target = "quantity")
    CartItemDto toDto(CartItem cartItem);
}
