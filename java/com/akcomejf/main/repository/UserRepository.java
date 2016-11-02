package com.akcomejf.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akcomejf.main.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
