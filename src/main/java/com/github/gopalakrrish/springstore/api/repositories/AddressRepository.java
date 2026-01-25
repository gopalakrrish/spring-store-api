package com.github.gopalakrrish.springstore.api.repositories;

import com.github.gopalakrrish.springstore.api.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}