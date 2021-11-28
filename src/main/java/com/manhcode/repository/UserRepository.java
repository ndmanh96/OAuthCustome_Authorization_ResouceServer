package com.manhcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manhcode.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByUsername(String username);
}
