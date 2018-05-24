package dev.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test Loose Coupling Impl
 * 
 * @author gauraw
 *
 */
public class TestLooseCouplingImpl {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		// when Resturant Class Object will be demanded at Runtime, Spring will
		// resolve all its dependency and return the object.
		Resturant r1 = (Resturant) context.getBean("resturant");
		r1.prepareHotDrink();
	}
}
