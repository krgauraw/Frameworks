package dev.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gauraw
 *
 */
public class TestWithApplicationContextImpl {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("context object is ready..");
		System.out.println("-----------------------------------");
		System.out.println();

		System.out.println("going to use w1_s bean...");
		System.out.println("-----------------------------");
		Welcome w1 = (Welcome) context.getBean("w1_s");
		System.out.println("Welcome Message::" + w1.getWelcomeMsg());
		System.out.println();

		System.out.println("going to use w2_s bean....Lazy Loading Configured for this bean.");
		System.out.println("-----------------------------");
		Welcome w2 = (Welcome) context.getBean("w2_s");
		System.out.println("Welcome Message::" + w2.getWelcomeMsg());
		System.out.println();

		System.out.println("going to use w_p bean....");
		System.out.println("-----------------------------");
		Welcome w3 = (Welcome) context.getBean("w3_p");
		System.out.println("Welcome Message::" + w3.getWelcomeMsg());
	}
}
