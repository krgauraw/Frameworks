package dev.spring.demo.autowired.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author gauraw
 *
 */
public class Person {

	private String name;

	@Autowired // @Autowired on properties
	private Address address;

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
