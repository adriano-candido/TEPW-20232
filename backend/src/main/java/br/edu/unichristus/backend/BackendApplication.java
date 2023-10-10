package br.edu.unichristus.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
	    info = @Info(
	        title = "Documentação API CRUD - Tópicos Web Unichristus",
	        version = "1.0",
	        description = "Trata-se da documentação da API construída em aula",
	        contact = @Contact(
	        	    name = "Adriano",
	        	    email = "adriano@unichristus.edu.br",
	        	     url = "https://www.unichristus.edu.br")
	    )
	)
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
