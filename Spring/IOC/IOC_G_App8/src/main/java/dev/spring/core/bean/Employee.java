package dev.spring.core.bean;

/**
 * Employee Bean Class.
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
