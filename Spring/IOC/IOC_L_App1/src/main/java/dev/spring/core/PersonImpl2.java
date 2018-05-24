package dev.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test Impl 2 ApplicationContext is used
 * 
 * @author gauraw
 *
 */
public class PersonImpl2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("Context is Ready");
		Person p1 = (Person) context.getBean("b1");
		System.out.println("Person Details::::::::::::");
		System.out.println("First Name::" + p1.getFirstName());
		System.out.println("Last Name::" + p1.getLastName());
		System.out.println("Age::" + p1.getAge());
	}
}
