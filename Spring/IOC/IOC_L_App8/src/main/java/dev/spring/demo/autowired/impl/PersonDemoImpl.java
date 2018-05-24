package dev.spring.demo.autowired.impl;

import dev.spring.core.util.IOCUtil;
import dev.spring.demo.autowired.model.Person;

/**
 * @author gauraw
 *
 */
public class PersonDemoImpl {

	public static void main(String[] args) {

		Person obj = (Person) IOCUtil.getObject("person"); // check bean definition in app-config.xml
		System.out.println("Person Data : ");
		System.out.println("Name : " + obj.getName());
		System.out
				.println("Address : Strret:" + obj.getAddress().getStreet() + " , City:" + obj.getAddress().getCity());
	}
}
