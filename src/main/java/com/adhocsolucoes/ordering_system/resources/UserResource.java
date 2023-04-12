package com.adhocsolucoes.ordering_system.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adhocsolucoes.ordering_system.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Arthur", "arthur@gmail.com", "9401-1673", "123456");
		return ResponseEntity.ok().body(u);
	}

}
