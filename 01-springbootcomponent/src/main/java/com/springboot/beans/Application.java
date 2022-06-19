package com.springboot.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.component.employee;

@SpringBootApplication
@ComponentScan(basePackages={"com.springboot.beans","com.springboot.component"})
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		employee1 emp=context.getBean(employee1.class);
		employee1 emp2=context.getBean(employee1.class);
		System.out.println(emp==emp2);
	}

}
