package com.gabkt.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabkt.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
