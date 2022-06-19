package com.springboot.setterinjection;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class student {
private address address;



public student() {
	System.out.println("student constructor");
}

@Autowired
public void setAddress(address address) {
	this.address = address;
}


public void display() {
	String s=address.address();
	System.out.println("address:"+s);
}


}
