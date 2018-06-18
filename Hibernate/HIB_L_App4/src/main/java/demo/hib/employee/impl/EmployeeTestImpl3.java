package demo.hib.employee.impl;

import java.util.List;

import org.hibernate.Session;

import demo.hib.employee.Employee;
import demo.hib.util.DBUtil;

/**
 * Read all data
 * 
 * @author gauraw
 *
 */
public class EmployeeTestImpl3 {

	public static void main(String[] args) {

		Session session = DBUtil.getSession();
		List<Employee> employees = session.createCriteria(Employee.class).list();
		System.out.println("Employee Data:\n----------------------------------");
		for (Employee emp : employees) {
			System.out.println(emp);
		}

	}
}
