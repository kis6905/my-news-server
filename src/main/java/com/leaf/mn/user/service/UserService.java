package com.leaf.mn.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leaf.mn.user.dto.User;
import com.leaf.mn.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User getUser(String userId) {
		return userRepository.findByUserId(userId);
	}
	
}
