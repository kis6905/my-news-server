package com.leaf.mn.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leaf.mn.user.dto.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUserId(String userId);

}
