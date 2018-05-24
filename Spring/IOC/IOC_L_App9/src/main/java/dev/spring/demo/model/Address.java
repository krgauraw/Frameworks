package dev.spring.demo.model;

/**
 * @author gauraw
 *
 */
public class Address {

	private String street;
	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void init() {
		System.out.println("Address bean is going through init...");
	}

	public void clean() {
		System.out.println("Address bean is going through clean...");
	}
}
