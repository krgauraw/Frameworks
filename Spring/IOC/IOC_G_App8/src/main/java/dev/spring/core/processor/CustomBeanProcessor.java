package dev.spring.core.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Custom Bean Processor. It will modify bean property values.
 * 
 * @author gauraw
 *
 */
public class CustomBeanProcessor implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("CustomBeanProcessor::::::::::::postProcessBeanFactory()");
		System.out.println("Overriding bean e1 values...");
		BeanDefinition beanDef = beanFactory.getBeanDefinition("e1");
		MutablePropertyValues propertyVal = beanDef.getPropertyValues();
		propertyVal.add("empId", new Integer(10000));

	}

}
