package com.any.tutorial.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String args[]) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		applicationContext.start();
		
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
		helloWorld.message();
		
		applicationContext.stop();
		
		applicationContext.registerShutdownHook();
	}

}
