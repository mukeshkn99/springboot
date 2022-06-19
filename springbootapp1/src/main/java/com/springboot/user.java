package com.springboot;

import org.springframework.stereotype.Component;

@Component
public class user {
public void call() {
	System.out.println("call tracking success ");
}
public void record() {
	System.out.println("recording calls");
}
}
