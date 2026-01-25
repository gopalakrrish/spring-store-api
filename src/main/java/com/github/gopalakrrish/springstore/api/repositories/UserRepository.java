package com.github.gopalakrrish.springstore.api.repositories;

import com.github.gopalakrrish.springstore.api.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
