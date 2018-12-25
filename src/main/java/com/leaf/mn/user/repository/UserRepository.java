package com.leaf.mn.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leaf.mn.user.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUserId(String userId);
	
}
