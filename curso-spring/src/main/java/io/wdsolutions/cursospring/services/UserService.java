package io.wdsolutions.cursospring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.wdsolutions.cursospring.entities.User;
import io.wdsolutions.cursospring.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User findById(Long id) {
		User user = this.repository.findById(id).get();
		return user;
	}
	
	public User findByEmail(String email) {
		User user = this.repository.findByEmail(email).get();
		return user;
	}
	
	public User findByName(String name) {
		User user = this.repository.findByName(name).get();
		return user;
	}
	
	public List<User> findAll(){
		List<User> users = this.repository.findAll();
		return users;
	}
	
	public List<User> findByNameLike(String name){
		List<User> users = this.repository.findByNameStartingWith(name);
		return users;
	}
}
