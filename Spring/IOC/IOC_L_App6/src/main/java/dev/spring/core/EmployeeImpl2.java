package dev.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demo of autowire="byName"
 * 
 * @author gauraw
 *
 */
public class EmployeeImpl2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-config2.xml");
		Employee e1 = (Employee) context.getBean("empDetails");

		System.out.println("Employee Id: " + e1.getEmpId());
		System.out.println("Employee Name: " + e1.getEmpName());
		System.out.println("Address: ");
		System.out.println("House No: " + e1.getEmpAdd().getHouseNo());
		System.out.println("Street Name: " + e1.getEmpAdd().getStreetName());

		System.out.println("----------------------------------------");
		Employee1 e2 = (Employee1) context.getBean("empDetails1");
		System.out.println("Employee Id: " + e2.getEmpId());
		System.out.println("Employee Name: " + e2.getEmpName());
		System.out.println("Address: ");
		System.out.println("House No: " + e2.getAdd().getHouseNo());
		System.out.println("Street Name: " + e2.getAdd().getStreetName());
	}
}
