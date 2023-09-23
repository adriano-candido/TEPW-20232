package br.edu.unichristus.backend.data.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"message", "key"})
public class MessageDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String message;
	private String key;

}
