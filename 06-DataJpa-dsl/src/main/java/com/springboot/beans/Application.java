package com.springboot.beans;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.beans.models.user;
import com.springboot.beans.repository.userrepository;

@SpringBootApplication
public class Application{

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		userrepository repo=context.getBean(userrepository.class);
		System.out.println(repo.getClass());

		System.out.println(repo.findByname("python"));
		
		System.out.println(repo.findBynameandaddress("python", "chennai"));
			}
}
