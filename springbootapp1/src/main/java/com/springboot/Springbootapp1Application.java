package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springbootapp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Springbootapp1Application.class, args);
	
         user u=run.getBean(user.class);
         u.call();
         u.record();
	}

}
