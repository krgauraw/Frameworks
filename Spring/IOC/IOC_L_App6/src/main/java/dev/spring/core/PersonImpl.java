package dev.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gauraw
 *
 */
public class PersonImpl {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-config3.xml");
		Person p1 = (Person) context.getBean("personDetails");

		System.out.println("Person Name: " + p1.getName());
		System.out.println("Address: ");
		System.out.println("House No: " + p1.getAddress().getHouseNo());
		System.out.println("Street Name: " + p1.getAddress().getStreetName());

	}
}
