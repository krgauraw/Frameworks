package dev.spring.demo.impl;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.spring.demo.model.Welcome;

/**
 * @author gauraw
 *
 */
public class WelcomeDemoImpl {

	// logger object
	static Logger log = Logger.getLogger(WelcomeDemoImpl.class.getName());

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		log.info("Context Object is Ready.");
		Welcome obj = (Welcome) context.getBean("welcome"); // Here "welcome" is bean id
		log.info("Welcome Object is Created");
		System.out.println(obj.getMessage());
	}
}
