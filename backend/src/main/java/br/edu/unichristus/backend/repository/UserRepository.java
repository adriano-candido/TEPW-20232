package br.edu.unichristus.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unichristus.backend.data.model.User;

public interface UserRepository 
						extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
	
	User findByLogin(String login);

}
