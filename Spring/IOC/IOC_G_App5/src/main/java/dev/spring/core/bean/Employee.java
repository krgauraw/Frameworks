package dev.spring.core.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Employee Bean Class
 * 
 * @author gauraw
 *
 */
public class Employee {

	private int empId;
	private String empName;

	public Employee() {
		System.out.println("Employee bean object creation is going on.......");
	}

	// init method - Post Construction of bean object, this method will be called
	@PostConstruct
	public void init() {
		System.out.println("Bean is going through init()....");
	}

	// destroy method - before destruction of bean object, this method will be invoked.
	@PreDestroy
	public void destroy() {
		System.out.println("Bean is going through destroy()....");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		System.out.println("Setting Employee Id");
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		System.out.println("Setting Employee Name");
		this.empName = empName;
	}

}
