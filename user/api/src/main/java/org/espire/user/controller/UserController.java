package org.espire.user.controller;

import org.espire.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;
	
	@PostMapping
	public ResponseEntity createUser(@RequestBody User user) {
		userServiceImpl.createUser(user);
		return ResponseEntity.ok().build();
	}
}
