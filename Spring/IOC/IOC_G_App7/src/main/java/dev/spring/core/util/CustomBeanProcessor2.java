package dev.spring.core.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * Custom Bean Processor
 * 
 * @author gauraw
 *
 */
public class CustomBeanProcessor2 implements BeanPostProcessor, Ordered {

	//Ordered interface method
	public int getOrder() {
		return 1; // Lower Value Stands for Higher Priority
	}

	// BeanPostProcessor method
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("CustomBeanProcessor2:::::::::postProcessBeforeInitialization()::::for " + beanName);
		return bean;
	}

	// BeanPostProcessor method
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("CustomBeanProcessor2::::::::::::postProcessAfterInitialization()::::for " + beanName);
		return bean;
	}

}
