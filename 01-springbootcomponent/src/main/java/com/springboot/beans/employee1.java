package com.springboot.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")
public class employee1 {
public void employee1() {
	System.out.println("my own employee contructor");
}
}
