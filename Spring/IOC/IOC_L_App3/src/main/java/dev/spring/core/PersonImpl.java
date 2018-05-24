package dev.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author gauraw
 *
 */
@SuppressWarnings("deprecation")
public class PersonImpl {
	public static void main(String[] args) {

		ClassPathResource cpr = new ClassPathResource("spring-config.xml");

		BeanFactory factory = new XmlBeanFactory(cpr);
		System.out.println(":::::bean factory created:::::::");

		Person p1 = (Person) factory.getBean("b1");// b1 is the bean id

		System.out.println(":::::Person object retrieved (bean id=b1, scope=singleton, Inject Mode : Setter):::::::");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Person Details::::::::::::");
		System.out.println("First Name:" + p1.getFirstName());
		System.out.println("Last Name:" + p1.getLastName());
		System.out.println("Age:" + p1.getAge());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("\n\n");

		Person p2 = (Person) factory.getBean("b2");// b2 is the bean id

		System.out.println(":::Person object retrieved (bean id=b2, scope=prototype, Inject Mode : Constructor)::::");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Person Details::::::::::::");
		System.out.println("First Name:" + p2.getFirstName());
		System.out.println("Last Name:" + p2.getLastName());
		System.out.println("Age:" + p2.getAge());
		System.out.println("---------------------------------------------------------------------------------------");

		System.out.println("::::::End Of Impl Class::::::");

	}
}