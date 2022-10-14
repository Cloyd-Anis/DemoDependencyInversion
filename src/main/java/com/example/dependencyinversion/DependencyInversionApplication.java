package com.example.dependencyinversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dependencyinversion.entity.AccountUser;
import com.example.dependencyinversion.entity.AdminUser;
import com.example.dependencyinversion.entity.Login;
import com.example.dependencyinversion.exception.NotAccountUserException;
import com.example.dependencyinversion.exception.NotAdminUserException;

@SpringBootApplication
public class DependencyInversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInversionApplication.class, args);

		AccountUser accountUser = new AccountUser();
		accountUser.setEmail("jane.doe@gmail.com");
		accountUser.setPassword("password");

		AdminUser adminUser = new AdminUser();
		adminUser.setEmail("cloyd.anis@gmail.com");
		adminUser.setPassword("admin123");



		try{
			Login loginUser = new Login(accountUser);
			loginUser.authenticate();
			if(adminUser != null){
				throw new NotAccountUserException("Admin User exist");
			}
		}catch (NotAccountUserException e) {
			if(adminUser != null){
				Login loginUser = new Login(adminUser);
				loginUser.authenticate();
			}
		}catch (NotAdminUserException e){
			System.out.println("Warning: You are not authorize!");
		}
	}

}
