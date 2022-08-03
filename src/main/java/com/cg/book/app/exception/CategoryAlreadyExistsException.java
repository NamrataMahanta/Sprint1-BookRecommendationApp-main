package com.cg.book.app.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.OK)

public class CategoryAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CategoryAlreadyExistsException() {
		super();
	}

	public CategoryAlreadyExistsException(String exceptionMessage) {
		super(exceptionMessage);
	}
}