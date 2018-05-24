package dev.spring.demo.autowired.impl;

import dev.spring.core.util.IOCUtil;
import dev.spring.demo.autowired.model.Employee;

/**
 * Test Impl to show uses of @Autowired on setter method. Here Employee Address
 * is Autowired
 * 
 * @author gauraw
 *
 */
public class EmployeeDemoImpl {

	public static void main(String[] args) {

		Employee obj = (Employee) IOCUtil.getObject("emp1"); // check bean definition in app-config.xml
		System.out.println("Employee Data : ");
		System.out.println("ID : " + obj.getEmpId());
		System.out.println("Name : " + obj.getEmpName());
		System.out.println(
				"Address : Strret:" + obj.getEmpAddress().getStreet() + " , City:" + obj.getEmpAddress().getCity());
	}
}
