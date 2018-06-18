package demo.hib.employee;

/**
 * @author gauraw
 *
 */
public class Employee {

	private int id;
	private String name;
	private int age;
	private String education;
	private String address;
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Employee : {" + System.lineSeparator());
		sb.append(" Id: " + id + "," + System.lineSeparator());
		sb.append(" Name: " + name + "," + System.lineSeparator());
		sb.append(" Age: " + age + "," + System.lineSeparator());
		sb.append(" Address: " + address + "," + System.lineSeparator());
		sb.append(" Education: " + education + "," + System.lineSeparator());
		sb.append(" Salary: " + salary + "," + System.lineSeparator());
		sb.append("}");
		return sb.toString();
	}

}
