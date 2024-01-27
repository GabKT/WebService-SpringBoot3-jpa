package com.gabkt.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabkt.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
