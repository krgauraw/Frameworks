package dev.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test Impl
 * 
 * @author gauraw
 *
 */
public class EmployeeImpl {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Employee e1 = (Employee) context.getBean("empDetails");

		System.out.println("Employee Id: " + e1.getEmpId());
		System.out.println("Employee Name: " + e1.getEmpName());
		System.out.println("Address: ");
		System.out.println(e1.getEmpAdd().getLine1());
		System.out.println(e1.getEmpAdd().getLine2());
		System.out.println(e1.getEmpAdd().getLine3());
		System.out.println("Project:");
		System.out.println("Name:" + e1.getProject().get("name"));
		System.out.println("Client Name:" + e1.getProject().get("client"));
		System.out.println("Duration:" + e1.getProject().get("duration"));

	}
}
