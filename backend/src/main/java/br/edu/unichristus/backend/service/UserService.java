package br.edu.unichristus.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.edu.unichristus.backend.converter.DozerConverter;
import br.edu.unichristus.backend.data.dto.UserDTO;
import br.edu.unichristus.backend.data.dto.UserLowDTO;
import br.edu.unichristus.backend.data.model.User;
import br.edu.unichristus.backend.exception.CommonsException;
import br.edu.unichristus.backend.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public UserDTO save(UserDTO dto) {
		if(dto.getName().length() > 100) {
			throw new CommonsException(HttpStatus.BAD_REQUEST, 
					"unichristus.backend.service.user.badrequest.exception", 
					"O nome do usuário excede o limite de 100 caracteres.");
		}
		
		if(!(repository.findByEmail(dto.getEmail()) == null)) {
			throw new CommonsException(HttpStatus.CONFLICT, 
					"unichristus.backend.service.user.conflict.exception", 
					"O email informado já existe.");
		}
		
		if(!(repository.findByLogin(dto.getLogin()) == null)) {
			throw new CommonsException(HttpStatus.CONFLICT, 
					"unichristus.backend.service.user.conflict.exception", 
					"O login informado já existe.");
		}
		
		if(dto.getId() != null) {
			this.findById(dto.getId());
		}
		
		var user = DozerConverter.parseObject(dto, User.class);
		var userDTOSaved = DozerConverter
				.parseObject(repository.save(user), UserDTO.class);
		
		return userDTOSaved;
	}
	
	public void delete(Long id) {
		this.findById(id);
		repository.deleteById(id);
	}
	
	
	
	public UserDTO findById(Long id) {
		var user = repository.findById(id);
		if(user == null || user.isEmpty()) {
			throw new CommonsException(HttpStatus.NOT_FOUND, 
					"unichristus.backend.service.user.notfound.exception",
					"Usuário não encontrado.");
		}
		return DozerConverter.parseObject(user.get(), UserDTO.class);
	}
	
	public List<UserLowDTO> findAll(){
		return DozerConverter.parseListObjects
				(repository.findAll(), UserLowDTO.class);
	}
	
	
}
