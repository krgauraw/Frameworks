package dev.spring.demo.jsr.impl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.spring.demo.jsr.model.Greet;

/**
 * @author gauraw
 *
 */
public class GreetDemoImpl {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

		//This will ensure a graceful shutdown and call the relevant destroy methods.
		context.registerShutdownHook();

		Greet obj = (Greet) context.getBean("greet"); // check bean definition in app-config.xml
		System.out.println("Greet Message : " + obj.getMessage());

		context.close();

	}
}
