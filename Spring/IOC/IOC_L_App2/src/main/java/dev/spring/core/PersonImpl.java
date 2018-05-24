package dev.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Test Impl
 * 
 * @author gauraw
 *
 */
public class PersonImpl {

	public static void main(String[] args) {

		ClassPathResource cpr = new ClassPathResource("spring-config.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(cpr);
		Person p1 = (Person) factory.getBean("b1");// b1 is the bean id

		System.out.println("Person Details : ");
		System.out.println("--------------------------------");
		System.out.println("First Name : " + p1.getFirstName());
		System.out.println("Last Name : " + p1.getLastName());
		System.out.println("Age : " + p1.getAge());

		p1.setAge(40); // value will be reflected in p1 only. It won't set to actual bean object (b1).
		System.out.println("Age : " + p1.getAge());

		// Demonstrating Prototype scope

		Person p2 = (Person) factory.getBean("b1");
		Person p3 = (Person) factory.getBean("b1");
		System.out.println("--------------------------------");
		System.out.println((p2 == p3) ? "Bean is having Singleton Scope" : "Bean is having Prototype Scope");

		// when scope=prototype then for every getBean() call one new object
		// will be generated. expected o/p should be false.

	}
}