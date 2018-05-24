package dev.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gauraw
 *
 */
public class EmployeeImpl1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		System.out.println("context object is ready");
		Employee e1 = (Employee) context.getBean("empDetails");
		System.out.println("Employee object is ready");
		System.out.println("Employee Id: " + e1.getEmpId());
		System.out.println("Employee Name: " + e1.getEmpName());
		System.out.println("Usage of bean object is over");

		// code to remove every bean object from container
		context.registerShutdownHook();

		System.out.println("End of Impl :::::::::");

	}
}
