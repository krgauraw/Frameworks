package dev.spring.core;

/**
 * @author gauraw
 *
 */
public class Person {

	private String name;
	private Address address;

	Person(String name, Address address) {
		System.out.println("::from Parametrised Constructor");
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

}
