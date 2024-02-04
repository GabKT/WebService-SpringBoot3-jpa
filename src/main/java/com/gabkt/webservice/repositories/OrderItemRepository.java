package com.gabkt.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabkt.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
