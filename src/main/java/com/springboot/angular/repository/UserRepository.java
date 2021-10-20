package com.springboot.angular.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.angular.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	public Iterable<User> deleteByUsername(String username);
	public User findByUsername(String username);

}
