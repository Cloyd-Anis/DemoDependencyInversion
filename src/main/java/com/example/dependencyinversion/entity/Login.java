package com.example.dependencyinversion.entity;

import org.springframework.beans.factory.annotation.Autowired;


public class Login {
	private final AuthenticateUser authenticateUser;

	@Autowired
	public Login(AuthenticateUser authenticateUser){
		this.authenticateUser = authenticateUser;
	}

	public void authenticate(){
		authenticateUser.authenticate();
	}

}
