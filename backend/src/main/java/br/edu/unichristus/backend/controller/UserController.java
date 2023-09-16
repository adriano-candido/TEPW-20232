package br.edu.unichristus.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unichristus.backend.data.model.User;
import br.edu.unichristus.backend.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;

	@PostMapping
	public User create(@RequestBody User user) {
		return service.create(user);
	}
	
	@GetMapping
	public List<User> findAll(){
		return service.findAll();
	}
	
}
