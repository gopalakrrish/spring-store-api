package com.github.gopalakrrish.springstore.api.mappers;

import com.github.gopalakrrish.springstore.api.dtos.RegisterUserRequest;
import com.github.gopalakrrish.springstore.api.dtos.UpdateUserRequest;
import com.github.gopalakrrish.springstore.api.dtos.UserDto;
import com.github.gopalakrrish.springstore.api.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
