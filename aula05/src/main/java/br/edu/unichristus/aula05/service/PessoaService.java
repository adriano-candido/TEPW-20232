package br.edu.unichristus.aula05.service;

import org.springframework.stereotype.Service;

import br.edu.unichristus.aula05.model.Pessoa;

@Service
public class PessoaService {
	
	private Integer id = 1;
	
	public Pessoa cadastrar(Pessoa p) {
		// Instruções para salvar no banco, acessando o repo
		p.setId(id++);
		return p;
	}

}
