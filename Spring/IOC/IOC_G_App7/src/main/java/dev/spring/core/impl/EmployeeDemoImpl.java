package dev.spring.core.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.spring.core.bean.Employee;
import dev.spring.core.bean.Person;

/**
 * Test Impl class to test Bean Life Cycle
 * 
 * @author gauraw
 *
 */
public class EmployeeDemoImpl {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		System.out.println("Context Object is ready for use..");

		System.out.println("Reading Employee Data..");
		Employee e1 = (Employee) context.getBean("e1");
		System.out.println("Employee Id::::::::" + e1.getEmpId());
		System.out.println("Employee Name::::::::::" + e1.getEmpName());

		Employee e2 = (Employee) context.getBean("e2");
		System.out.println("Employee Id::::::::" + e2.getEmpId());
		System.out.println("Employee Name::::::::::" + e2.getEmpName());

		Person p1 = (Person) context.getBean("p1");
		System.out.println("Person Id:::::" + p1.getPid());
		System.out.println("Person Name:::" + p1.getpName());

		System.out.println("Object is going to destroy.....");
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
