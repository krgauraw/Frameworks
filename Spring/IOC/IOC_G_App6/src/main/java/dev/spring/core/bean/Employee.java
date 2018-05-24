package dev.spring.core.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Employee Bean Class. InitializingBean interface can be used to perform
 * operation after bean instantiation. DisposableBean interface can be used to
 * perform operation before bean destruction.
 * 
 * @author gauraw
 *
 */
public class Employee implements InitializingBean, DisposableBean {

	private int empId;
	private String empName;

	public Employee() {
		System.out.println("Employee bean object creation is going on.......");
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

	// Method of InitializingBean interface
	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee bean is going through afterPropertiesSet()...");
	}

	// Method of DisposableBean interface
	public void destroy() throws Exception {
		System.out.println("Employee Bean is going through destroy()...");
	}

}
