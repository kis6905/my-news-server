package com.leaf.mn.user.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leaf.mn.user.dto.User;
import com.leaf.mn.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void postConstruct() {
		userRepository.save(User.builder().id(1).userId("iskwon").password("$2a$10$qO3wIk1YZqIgoE7d4/o9l.K3CmT4SDcKRv8M6nPLuMGnS3QA9mpG.").name("권일수").build());
		userRepository.save(User.builder().id(2).userId("test01").password("$2a$10$qO3wIk1YZqIgoE7d4/o9l.K3CmT4SDcKRv8M6nPLuMGnS3QA9mpG.").name("테스트01").build());
		userRepository.save(User.builder().id(3).userId("test02").password("$2a$10$qO3wIk1YZqIgoE7d4/o9l.K3CmT4SDcKRv8M6nPLuMGnS3QA9mpG.").name("테스트02").build());
	}
	
	public User getUser(String userId) {
		return userRepository.findByUserId(userId);
	}
	
}
