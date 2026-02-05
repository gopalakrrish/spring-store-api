package com.github.gopalakrrish.springstore.api.mappers;

import com.github.gopalakrrish.springstore.api.dtos.CartDto;
import com.github.gopalakrrish.springstore.api.entities.Cart;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto toDto(Cart cart);
}
