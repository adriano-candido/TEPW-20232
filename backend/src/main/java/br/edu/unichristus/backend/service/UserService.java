package br.edu.unichristus.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import br.edu.unichristus.backend.data.model.User;
import br.edu.unichristus.backend.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User create(User user) {
		if(user.getName().length() > 100) {
			System.out.println("O nome excede a quantidade de caracteres");
		}
		
		return repository.save(user);
	}
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	
}
