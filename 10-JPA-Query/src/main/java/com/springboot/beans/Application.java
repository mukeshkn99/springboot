package com.springboot.beans;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.beans.models.student;
import com.springboot.beans.repository.studentrepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		studentrepository st=context.getBean(studentrepository.class);
		System.out.println(st.getClass());
	System.out.println(st.fetchalldetails());
	System.out.println(st.fetchallusername("arivu"));
	System.out.println(st.fetchallnampassword("kanesh",124));
	System.out.println(st.updatenameforpassword("arivu", 125));
	
	
	}
}
