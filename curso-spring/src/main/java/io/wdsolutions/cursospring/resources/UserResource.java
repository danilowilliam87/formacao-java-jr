package io.wdsolutions.cursospring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.wdsolutions.cursospring.entities.User;
import io.wdsolutions.cursospring.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable(name = "id") Long id){
		User user = this.service.findById(id);
		return ResponseEntity.ok().body(user);
	}
	
	@GetMapping(value = "/name/{name}")
	public ResponseEntity<User> findByName(@PathVariable(value = "name") String  name){
		User user = this.service.findByName(name);
		return ResponseEntity.ok().body(user);
	}
	
	@GetMapping(value = "/email/{email}")
	public ResponseEntity<User> findByEmail(@PathVariable(value = "email") String  email){
		User user = this.service.findByEmail(email);
		return ResponseEntity.ok().body(user);
	}
	
	@GetMapping(value = "/list")
	public ResponseEntity<List<User>> findAll(){
	    List<User> users = this.service.findAll();
	    return ResponseEntity.ok().body(users);
	}
	
	@GetMapping(value = "/list/{name}")
	public ResponseEntity<List<User>> findByNameLike(@PathVariable(value = "name") String name){
	    List<User> users = this.service.findByNameLike(name);
	    return ResponseEntity.ok().body(users);
	}
}
