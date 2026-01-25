package com.github.gopalakrrish.springstore.api.repositories;

import com.github.gopalakrrish.springstore.api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}