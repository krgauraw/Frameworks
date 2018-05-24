package dev.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author gauraw
 *
 */
public class TestWithBeanFactoryImpl {

	public static void main(String[] args) {

		ClassPathResource cpr = new ClassPathResource("spring-config.xml");
		BeanFactory factory = new XmlBeanFactory(cpr);

		System.out.println("factory object got created..");
		System.out.println("--------------------------------");
		System.out.println();

		System.out.println("going to use w1_s bean...");
		System.out.println("-----------------------------");
		Welcome w1 = (Welcome) factory.getBean("w1_s");
		System.out.println("Welcome Message::" + w1.getWelcomeMsg());
		System.out.println();

		System.out.println("going to use w2_s bean...");
		System.out.println("-----------------------------");
		Welcome w2 = (Welcome) factory.getBean("w2_s");
		System.out.println("Welcome Message::" + w2.getWelcomeMsg());
		System.out.println();

		System.out.println("going to use w3_p bean...");
		System.out.println("-----------------------------");
		Welcome w3 = (Welcome) factory.getBean("w3_p");
		System.out.println("Welcome Message::" + w3.getWelcomeMsg());
	}
}
