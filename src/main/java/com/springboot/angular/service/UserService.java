package com.springboot.angular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.angular.model.User;
import com.springboot.angular.repository.UserRepository;

@Service
//@Transactional
public class UserService {

	@Autowired
	private UserRepository repo;

	public UserService() {}
	
	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void saveMyUser(User user) {
		repo.save(user);
	}
	
	public Iterable<User> showAllUsers(){
		return repo.findAll();
	}
	
	public Iterable<User> deleteUserByUsername(String username){
		repo.deleteByUsername(username);
		return repo.findAll();
	}

	public User findByUsername(String username) {
		repo.findByUsername(username);
		return repo.findByUsername(username);
		
	}
	
}
