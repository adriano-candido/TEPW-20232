package br.edu.unichristus.aula05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unichristus.aula05.model.Pessoa;
import br.edu.unichristus.aula05.service.PessoaService;

@RestController
public class PessoaController {

	@Autowired
	PessoaService service;
	
	@PostMapping("/pessoa")
	public Pessoa cadastrar(Pessoa p) {
		
		return null;
	}
	
}
