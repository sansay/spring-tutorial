package com.any.tutorial.spring;

public class HelloWorld {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void message() {
		System.out.println("Message is " + getMessage());
	} 
	
	public void init() {
		System.out.println("Bean initialization");
	}
	
	public void destroy() {
		System.out.println("Bean destroy");
	}
	
}
