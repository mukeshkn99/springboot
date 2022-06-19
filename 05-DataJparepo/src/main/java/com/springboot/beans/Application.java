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

		//saveuserinfo(repo);
		
	  //findalldetails(repo);
		//retrieveid(repo);
		
		
		findalldetails(repo);
		
	}

	private static void retrieveid(userrepository repo) {
		Optional<user> opt=repo.findById(2);
		if(opt.isPresent()) {
			user db=opt.get();
			System.out.println(db);
		}else {
			System.out.println("record not received");
		}
	}

	private static void findalldetails(userrepository repo) {
		Iterable<user> i=repo.findAll();
		  i.forEach(user->System.out.println(user));
	}

	private static void saveuserinfo(userrepository repo) {
		user u1=new user();
		u1.setUserId(1);
		u1.setName("java");
		u1.setEmail("java@123");
		u1.setAddress("chennai");
		
		repo.save(u1);
	}
}
