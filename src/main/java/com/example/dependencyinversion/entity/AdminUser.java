package com.example.dependencyinversion.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "admin_users")
@Data
public class AdminUser extends User implements AuthenticateUser {

	@Override
	public void authenticate() {
		System.out.println("Authenticate as Admin User");
	}
}
