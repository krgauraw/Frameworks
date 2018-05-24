package dev.spring.core.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.spring.core.bean.Employee;
import dev.spring.core.bean.Student;

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
		System.out.println("Employee Id:" + e1.getEmpId());
		System.out.println("Employee Name:" + e1.getEmpName());

		Employee e2 = (Employee) context.getBean("e2");
		System.out.println("Employee Id:" + e2.getEmpId());
		System.out.println("Employee Name:" + e2.getEmpName());

		System.out.println("Reading Student Data..");

		Student s1 = (Student) context.getBean("s1");
		System.out.println("Student Id:" + s1.getSid());
		System.out.println("Student Name:" + s1.getsName());

		System.out.println("Object is going to destroy.....");
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
