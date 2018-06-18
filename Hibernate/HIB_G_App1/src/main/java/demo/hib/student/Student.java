package demo.hib.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author gauraw
 *
 */
@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@Column(name = "ROLL_NUM")
	// By default GenerationType.SEQUENCE will be  considered by framework, if oracle db is used.
	@GeneratedValue
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int rollNum;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Transient // this annotation is used to ignore the field by Hibernate Framework for all CRUD Operation.
	private String address;

	// By default hibernate map Date field to datatype timestamp. If we want to explicitly, we should use @Temporal annotation as below
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
