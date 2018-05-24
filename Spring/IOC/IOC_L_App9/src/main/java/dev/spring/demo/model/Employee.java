package dev.spring.demo.model;

/**
 * @author gauraw
 *
 */
public class Employee {

	private String empId;
	private String eName;
	private Address empAddress;

	public Employee(Address address) {
		empAddress = address;
	}

	public Employee() {
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

}
