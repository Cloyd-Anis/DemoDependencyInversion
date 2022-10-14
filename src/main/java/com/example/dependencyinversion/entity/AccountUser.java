package com.example.dependencyinversion.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "account_users")
@Data
public class AccountUser extends User implements AuthenticateUser {
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Override
	public void authenticate() {
		System.out.println("Authenticate as Account User");
	}
}
