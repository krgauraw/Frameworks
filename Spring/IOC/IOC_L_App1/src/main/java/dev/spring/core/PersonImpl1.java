package dev.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Test Impl 1. BeanFactory is used.
 * 
 * @author gauraw
 *
 */
public class PersonImpl1 {
	public static void main(String[] args) {

		ClassPathResource cpr = new ClassPathResource("spring-config.xml");

		BeanFactory factory = new XmlBeanFactory(cpr);

		Person p1 = (Person) factory.getBean("b1");// b1 is the bean id

		System.out.println("Person Details::::::::::::");
		System.out.println("First Name : " + p1.getFirstName());
		System.out.println("Last Name : " + p1.getLastName());
		System.out.println("Age : " + p1.getAge());
		System.out.println("----------------------------------");

		// Added for accessing more record - start

		Person p2 = (Person) factory.getBean("b2");
		System.out.println("Person Details::::::::::::");
		System.out.println("First Name : " + p2.getFirstName());
		System.out.println("Last Name : " + p2.getLastName());
		System.out.println("Age : " + p2.getAge());
		System.out.println("----------------------------------");

		System.out.println("::Singleton Scope Demo::");
		Person p3 = (Person) factory.getBean("b1");
		Person p4 = (Person) factory.getBean("b1");
		System.out.print("Is Object p3 & p4 are Same??? ");
		System.out.print(p3 == p4 ? "Yes" : "No");

	}
}
