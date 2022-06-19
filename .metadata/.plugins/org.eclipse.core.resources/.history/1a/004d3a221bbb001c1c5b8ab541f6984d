package com.springboot.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.models.user;
import com.springboot.repository.userinterface;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		userinterface repo=context.getBean(userinterface.class);
		System.out.println(repo.getClass());
		
		
		user u1=new user();
		u1.setUserId(1);
		u1.setName("java");
		u1.setEmail("java@123");
		u1.setAddress("chennai");
		
		repo.save(u1);
		
	}

}
