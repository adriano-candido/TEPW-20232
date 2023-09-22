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
	
	public User save(User user) {
		if(user.getName().length() > 100) {
			System.out.println("O nome excede a quantidade de caracteres");
		}
		
		if(user.getId() != null) {
			var userFind = this.findById(user.getId());
			if(userFind == null) {
				return null;
			}
		}
		
		return repository.save(user);
	}
	
	public void delete(Long id) {
		var userFind = this.findById(id);
		if(userFind == null) {
			return;
		}
		
		repository.deleteById(id);
	}
	
	
	
	public User findById(Long id) {
		var user = repository.findById(id);
		if(user == null || user.isEmpty()) {
			System.out.println("A ID informada não existe");
			return null;
		}
		
		return user.get();
	}
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	
}
