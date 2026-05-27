package com.github.gopalakrrish.springstore.api.mappers;

import com.github.gopalakrrish.springstore.api.dtos.OrderDto;
import com.github.gopalakrrish.springstore.api.entities.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto toDto(Order order);

}
