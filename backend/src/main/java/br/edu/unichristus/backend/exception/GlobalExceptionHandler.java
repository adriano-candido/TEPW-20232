package br.edu.unichristus.backend.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.edu.unichristus.backend.data.dto.MessageDTO;

@ControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger logger = 
			LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(CommonsException.class)
	protected ResponseEntity<MessageDTO> handleCommonsException(
			CommonsException exception) {
		logger.error("[exception] " + exception);
		return exception.getMessageError();
	}

	@ExceptionHandler(Exception.class)
	protected ResponseEntity<MessageDTO> handleException(Exception ex) {
		logger.error("Exception não tratada: ", ex);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
				new MessageDTO("Exception não tratada: " + ex.toString(), 
						"unichristus.global.handler.exception"));
	}
}
