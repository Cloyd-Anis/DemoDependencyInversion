package com.example.dependencyinversion.exception;

public class NotAdminUserException extends RuntimeException {

	public NotAdminUserException(String message) {
		super(message);
	}
}
