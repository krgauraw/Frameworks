package dev.spring.demo.autowired.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author gauraw
 *
 */
public class Student {

	private String sid;
	private String name;
	private Address address;

	@Autowired // uses on Constructor
	public Student(Address address) {
		this.address = address;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
