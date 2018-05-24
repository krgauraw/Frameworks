package dev.spring.demo.autowired.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author gauraw
 *
 */
public class Employee {

	private int empId;
	private String empName;
	private Address empAddress;

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

	public Address getEmpAddress() {
		return empAddress;
	}

	// @Autowired on setter
	@Autowired
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

}
