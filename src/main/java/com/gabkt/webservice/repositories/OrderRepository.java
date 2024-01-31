package com.gabkt.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabkt.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
