package com.ds04011.SpringExample.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringExample.mvc.domain.User;
import com.ds04011.SpringExample.mvc.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User getLastUser() { 
		return userRepository.selectLastUser();
	}
	
	public int addUser(User user) {
		
		int count = userRepository.addUser(user);
		return count;
	}
	
}
