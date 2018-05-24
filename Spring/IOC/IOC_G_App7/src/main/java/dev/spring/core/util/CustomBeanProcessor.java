package dev.spring.core.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Custom Bean Processor. This Code will execute for every bean instantiation.
 * 
 * @author gauraw
 *
 */
public class CustomBeanProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("going through postProcessBeforeInitialization() for bean:::::::::::" + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("going through postProcessAfterInitialization() for bean::::::::::::" + beanName);
		return bean;
	}

}
