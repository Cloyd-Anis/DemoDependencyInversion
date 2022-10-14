package com.example.dependencyinversion.entity;

import org.springframework.stereotype.Component;

@Component
public interface AuthenticateUser {
	void authenticate();
}
