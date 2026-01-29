package com.github.gopalakrrish.springstore.api.mappers;

import com.github.gopalakrrish.springstore.api.dtos.ProductDto;
import com.github.gopalakrrish.springstore.api.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(source = "category.id", target = "categoryId")
    ProductDto toDto(Product product);
}
