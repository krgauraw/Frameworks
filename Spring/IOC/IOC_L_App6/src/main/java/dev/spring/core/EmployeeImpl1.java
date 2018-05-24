package dev.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gauraw
 *
 */
public class EmployeeImpl1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		Employee e1 = (Employee) context.getBean("empDetails");

		System.out.println("Employee Id: " + e1.getEmpId());
		System.out.println("Employee Name: " + e1.getEmpName());
		System.out.println("Address: ");
		System.out.println("House No: " + e1.getEmpAdd().getHouseNo());
		System.out.println("Street Name: " + e1.getEmpAdd().getStreetName());

	}
}
