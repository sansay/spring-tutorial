package com.any.tutorial.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class InitHelloWorld implements BeanPostProcessor, Ordered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.toLowerCase().indexOf("listener") == -1)
			System.out.println("BeforeInitialization: " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.toLowerCase().indexOf("listener") == -1)
			System.out.println("AfterInitialization: " + beanName);
		return bean;
	}

	@Override
	public int getOrder() {
		return 0;
	}
	
	
}
