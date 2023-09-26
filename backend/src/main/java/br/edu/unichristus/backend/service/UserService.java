package br.edu.unichristus.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.List;

import br.edu.unichristus.backend.data.model.User;
import br.edu.unichristus.backend.exception.CommonsException;
import br.edu.unichristus.backend.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User save(User user) {
		if(user.getName().length() > 100) {
			throw new CommonsException(HttpStatus.BAD_REQUEST, 
					"unichristus.backend.service.user.badrequest.exception", 
					"O nome do usuário excede o limite de 100 caracteres.");
		}
		
		if(!(repository.findByEmail(user.getEmail()) == null)) {
			throw new CommonsException(HttpStatus.CONFLICT, 
					"unichristus.backend.service.user.conflict.exception", 
					"O email informado já existe.");
		}
		
		if(!(repository.findByLogin(user.getLogin()) == null)) {
			throw new CommonsException(HttpStatus.CONFLICT, 
					"unichristus.backend.service.user.conflict.exception", 
					"O login informado já existe.");
		}
		
		if(user.getId() != null) {
			this.findById(user.getId());
		}
		
		return repository.save(user);
	}
	
	public void delete(Long id) {
		this.findById(id);
		repository.deleteById(id);
	}
	
	
	
	public User findById(Long id) {
		var user = repository.findById(id);
		if(user == null || user.isEmpty()) {
			throw new CommonsException(HttpStatus.NOT_FOUND, 
					"unichristus.backend.service.user.notfound.exception",
					"Usuário não encontrado.");
		}
		return user.get();
	}
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	
}
