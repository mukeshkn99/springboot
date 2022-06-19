package com.springboot.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.setterinjection.student;

@SpringBootApplication
@ComponentScan(basePackages= {"com.springboot.setterinjection"})
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(Application.class, args);
		student s=c.getBean(student.class);
		s.display();
	}

}
