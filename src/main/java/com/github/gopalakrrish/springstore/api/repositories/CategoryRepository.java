package com.github.gopalakrrish.springstore.api.repositories;

import com.github.gopalakrrish.springstore.api.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}