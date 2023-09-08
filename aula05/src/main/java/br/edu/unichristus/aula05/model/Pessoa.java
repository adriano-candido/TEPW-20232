package br.edu.unichristus.aula05.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
	
	private Integer id;
	private String nome;
	private String cpf;

}
