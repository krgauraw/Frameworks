package dev.spring.core;

import java.util.Properties;

/**
 * Employee Bean Class
 * 
 * @author gauraw
 *
 */
public class Employee {
	private int empId;
	private String empName;
	private Address empAdd;
	private Properties project;

	public Address getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(Address empAdd) {
		this.empAdd = empAdd;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Properties getProject() {
		return project;
	}

	public void setProject(Properties project) {
		this.project = project;
	}

}
