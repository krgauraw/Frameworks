package dev.spring.demo.autowired.impl;

import dev.spring.core.util.IOCUtil;
import dev.spring.demo.autowired.model.Student;

/**
 * @author gauraw
 *
 */
public class StudentDemoImpl {

	public static void main(String[] args) {

		Student obj = (Student) IOCUtil.getObject("student"); // check bean definition in app-config.xml
		System.out.println("Student Data : ");
		System.out.println("ID : " + obj.getSid());
		System.out.println("Name : " + obj.getName());
		System.out
				.println("Address : Strret:" + obj.getAddress().getStreet() + " , City:" + obj.getAddress().getCity());
	}
}
