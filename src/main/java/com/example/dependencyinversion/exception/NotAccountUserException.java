package com.example.dependencyinversion.exception;

public class NotAccountUserException extends RuntimeException {

	public NotAccountUserException(String message) {
		super(message);
	}
}
