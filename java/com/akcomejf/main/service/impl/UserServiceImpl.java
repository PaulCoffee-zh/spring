package com.akcomejf.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akcomejf.main.domain.User;
import com.akcomejf.main.repository.UserRepository;
import com.akcomejf.main.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User findById(Long id){
		return userRepository.findOne(id);
	}
	
}
