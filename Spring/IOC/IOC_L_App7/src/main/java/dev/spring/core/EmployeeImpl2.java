package dev.spring.core;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test Impl to remove specific bean object from container.
 * 
 * @author gauraw
 *
 */
public class EmployeeImpl2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		System.out.println("context object is ready");
		Employee e1 = (Employee) context.getBean("empDetails");
		System.out.println("Employee object is ready");
		System.out.println("Employee Id: " + e1.getEmpId());
		System.out.println("Employee Name: " + e1.getEmpName());

		// code to remove single bean object from container
		ConfigurableListableBeanFactory clbf = context.getBeanFactory();
		BeanDefinitionRegistry bdr = (BeanDefinitionRegistry) clbf;

		// Removing bean object from container
		bdr.removeBeanDefinition("empDetails");

		System.out.println("bean object removed with name \"empDetails\"");

		System.out.println("Is empDetails bean available? : " + (context.containsBean("empDetails") ? "Yes" : "No"));
		System.out.println("Is Bean Definition Available for bean \"empDetails\" : "
				+ (context.containsBeanDefinition("empDetails") ? "Yes" : "No"));
		System.out.println("Is Local bean available with name \"empDetails\" : "
				+ (context.containsLocalBean("empDetails") ? "Yes" : "No"));

		System.out.println("End of Impl :::::::::");

	}
}
