package com.github.gopalakrrish.springstore.api.repositories;

import com.github.gopalakrrish.springstore.api.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
