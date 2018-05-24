package dev.spring.demo.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.spring.demo.config.AppConfig;
import dev.spring.demo.model.Employee;

/**
 * @author gauraw
 *
 */
public class EmployeeDemoImpl {

	//Logging using Jakarta Commons Logging (JCL) API. It requires commons.logging-x.x.jar on classpath
	static Log log = LogFactory.getLog(EmployeeDemoImpl.class.getName());

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		log.info("Context is Ready. Creating Employee Object.");

		Employee emp = ctx.getBean(Employee.class);
		emp.setEmpId("101");
		emp.seteName("Raj");
		emp.getEmpAddress().setStreet("BTM");
		emp.getEmpAddress().setCity("Bengaluru");

		log.info("Reading Employee Data.");

		System.out.println("Employee Data:");
		System.out.println("ID:" + emp.getEmpId());
		System.out.println("Name:" + emp.geteName());
		System.out.println(
				"Address : Strret:" + emp.getEmpAddress().getStreet() + " , City:" + emp.getEmpAddress().getCity());

		// Way to load more than one configuration classes.

		/*AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class, OtherConfig.class);
		ctx.register(AdditionalConfig.class);
		ctx.refresh();
		MyService myService = ctx.getBean(MyService.class);
		myService.doStuff();*/

	}
}
