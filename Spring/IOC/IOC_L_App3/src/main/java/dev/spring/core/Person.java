package dev.spring.core;

/**
 * Bean Class
 * 
 * @author gauraw
 *
 */
public class Person {
	private String firstName;
	private String lastName;
	private int age;

	Person() {
		System.out.println("<--from default constructor-->");
	}

	Person(String fName, String lName, int age) {
		System.out.println("<--from parameterized constructor-->");
		firstName = fName;
		lastName = lName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("<--from setFirstName()-->");
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("<--from setLastName()-->");
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("<--from setAge()-->");
		this.age = age;
	}

}