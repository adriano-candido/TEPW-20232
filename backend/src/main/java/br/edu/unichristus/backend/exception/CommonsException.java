package br.edu.unichristus.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.edu.unichristus.backend.data.dto.MessageDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@AllArgsConstructor
public class CommonsException extends RuntimeException {
	private static final long serialVersionUID = -4694258578216919456L;
	protected HttpStatus status;
	protected String key;
	protected String text;

	public ResponseEntity<MessageDTO> getMessageError() {
		return ResponseEntity.status(status)
				.body(new MessageDTO(text, key));
	}
}