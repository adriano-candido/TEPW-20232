package br.edu.unichristus.backend.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLowDTO {
	
	private Long id;
	
	@JsonProperty("nome")
	private String name;
	
	private String email;
	private String login;

}
