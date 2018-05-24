package dev.spring.core;

/**
 * @author gauraw
 *
 */
public class Employee {
	private int empId;
	private String empName;

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

	public void destroy() throws Exception {
		System.out.println("::from destroy() of Employee Class::");

	}

}
